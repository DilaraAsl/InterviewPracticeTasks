package com.cydeo.service;

import com.cydeo.model.*;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.rmi.NoSuchObjectException;
import java.util.*;
import java.util.stream.Collectors;

import static com.cydeo.service.DataGenerator.findUserById;

public class Implementation {

    /**
     * Read all student users.
     *
     * @return all the student users {@link User} and {@link com.cydeo.model.Role}
     */
    public static List<User> readAllStudents() {
        DataGenerator.fillUsers().stream().filter(s->s.getRole().equals("STUDENT")).collect(Collectors.toList());
        //TODO
        return null;
    }


    /**
     * Read all admin users.
     *
     * @return all the admin users {@link User} and {@link com.cydeo.model.Role}
     */

    public static List<User> readAllAdmins() {

        return DataGenerator.fillUsers().stream().filter(a->a.getRole().equals("ADMIN")).collect(Collectors.toList());

    }

    /**
     * Read all manager users.
     *
     * @return all the manager users {@link User} and {@link com.cydeo.model.Role}
     */
    public static List<User> readAllManagers() {
        //TODO
        return DataGenerator.fillUsers().stream().filter(m->m.getRole().equals("MANAGER")).collect(Collectors.toList());

    }

    /**
     * Read all SUSPENDED users.
     *
     * @return all the suspended users
     */
    public static List<User> readAllSuspendedUsers() {
        //TODO
        return DataGenerator.fillUsers().stream().filter(s->s.getState().equals("SUSPENDED")).collect(Collectors.toList());
    }

    /**
     * Read all CONFIRMED users.
     *
     * @return all the confirmed users {@link User} and {@link UserState}
     */
    public static List<User> readAllConfirmedUsers() {
        //TODO
        return DataGenerator.fillUsers().stream().filter(c->c.getState().equals("CONFIRMED")).collect(Collectors.toList());
    }

    /**
     * Read all PENDING users.
     *
     * @return all the pending users {@link User} and {@link UserState}
     */
    public static List<User> readAllPendingUsers() {
        //TODO
        return DataGenerator.fillUsers().stream().filter(c->c.getState().equals("PENDING")).collect(Collectors.toList());
    }


    /**
     * Count all courses.
     *
     * @return number of courses {@link Course}
     */
    public static Long countCourses() {
        //TODO
        return DataGenerator.fillCourses().stream().count();

    }


    /**
     * Sum the all duration of courses.
     *
     * @return sum of duration {@link Course}.
     */
    public static Integer sumDurationForAllData() {
        //TODO
        return DataGenerator.fillCourses().stream().map(Course::getDuration).reduce(Integer::sum).get();
    }

    /**
     * Find Courses attended by a specific user.
     *
     * @param id userId information is necessary.
     * @return all courses with user id {@link User} and {@link Course}
     */
    public static List<Course> findCoursesByUserId(Integer id) {
        User specificUser = findUserById(id);
        //TOD0
        return DataGenerator.fillCoursesAssigned().stream()
                .filter(u->u.getUser().equals(specificUser))
                .map(CourseAssigned::getCourse).collect(Collectors.toList());
    }


    /**
     * This method converts the duration of course to the weeks based on user information.
     * One week has 40 hours working time. Divider should be 40.
     *
     * @param id userId information is necessary.
     * @return converted duration to week. {@link BigDecimal}
     */
    public static Integer divideToWeek(Integer id) {
        //TODO
        return (DataGenerator.fillCourses().stream().map(Course::getDuration).reduce(Integer::sum).get())/40;

    }

    /**
     * This method groups all the CourseAssigned based on their status
     * and numbers. (ex. 4 courses are IN_PROGRESS)
     *
     * @return all CourseStatus with number of courses in that status as a Map<CourseStatus, Long>
     * {@link CourseStatus}
     */
    public static Map<CourseStatus, Long> countCoursesByStatus() {
        //TODO
        return DataGenerator.fillCoursesAssigned().stream()
                .collect(Collectors.groupingBy(CourseAssigned::getStatus,Collectors.counting()));




    }

    /**
     * This method finds the courses which has max duration
     * and min duration. Use teeing method.
     *
     * @return Map in this format (ex. Max Duration=1000)
     */

    public static Map<String, Integer> getMinMaxCourseDuration() {
        //TODO

        Map<String,Integer> maxMinMap=  DataGenerator.fillCourses().stream()

                .collect(
                        Collectors.teeing(
                                Collectors.maxBy(Comparator.comparing(Course::getDuration)),
                                Collectors.minBy(Comparator.comparing(Course::getDuration)),
                                (e1, e2) -> {
                                    HashMap<String, Integer> map = new HashMap<>();
                                    map.put("MAX", e1.orElseThrow().getDuration());
                                    map.put("MIN", e2.orElseThrow().getDuration());
                                    return map;
                                }
                        ));
        return maxMinMap;
    }

    /**
     * This method finds the first user
     * who is first name starts with J
     *
     * @return the first user depending on first name
     */
    public static User findFirstWithFirstName() {
        //TODO
      return  DataGenerator.fillUsers().stream().filter(u->u.getFirstName().startsWith("J")).findFirst().orElseThrow();

    }

    /**
     * This method finds any user whose
     * last name is Wooden. If no user exists with this last name
     * then throw exception.
     *
     * @return the first user depending on first name
     */
    public static User findAnyWithLastName() {
        //TODO
        return DataGenerator.fillUsers().stream().filter(u->u.getLastName().equals("Wooden")).findAny().orElseThrow(RuntimeException::new);

    }

    /**
     * This method partitions the users
     * depending on whether user state is CONFIRMED
     *
     * @return map
     */
    public static Map<Boolean, List<User>> partitionOfConfirmedUsers() {
        //TODO

        Map<Boolean,List<User>> confirmedUserMap=DataGenerator.fillUsers().stream()
                .collect(Collectors.partitioningBy(user->user.getState().compareTo(UserState.CONFIRMED)==0));
                    return confirmedUserMap;




    }

    /**
     * This method groups all CourseAssigned depending on
     * CourseStatus
     *
     * @return map
     */

    public static Map<CourseStatus, List<CourseAssigned>> groupOfCourseAssigned() {

        return DataGenerator.fillCoursesAssigned().stream().collect(Collectors.groupingBy(CourseAssigned::getStatus,Collectors.toList()));
    }
}
