import database.Database;
import entity.Course;
import entity.Parent;
import entity.School;
import entity.Student;
import service.*;

import java.util.ArrayList;
import java.util.List;

import static database.Database.courseList;
import static database.Database.studentList;

public class SchoolMainRunner {

   public static CRUDService<School> schoolService;
    public static CRUDService<Course> courseService;
    public static CRUDService<Parent> parentService;
    public static CRUDService<Student> studentService;

    static {
        SchoolMainRunner.schoolService = new SchoolService();
        SchoolMainRunner.courseService = new CourseService();
        SchoolMainRunner.parentService = new ParentService();
        SchoolMainRunner.studentService = new StudentService();
    }

    public static void main(String[] args) {

     // Database.courseList.forEach(System.out::println);

    School cydeo=new School(1,"Cydeo",studentList,courseList);

    SchoolService ss=new SchoolService();

    ss.update(cydeo);

      //  System.out.println(schoolService.findById(987).getName());
     //  schoolService.findAll().stream().forEach(s->System.out.println(s.getName()));

        System.out.println(schoolService.findAll());

    }


}