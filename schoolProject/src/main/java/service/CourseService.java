package service;

import entity.Course;

import java.util.List;
import java.util.stream.Collectors;

import static database.Database.courseList;

public class CourseService implements CRUDService<Course>{
    @Override

    public Course findById(int id) {
        return courseList.stream().filter(c->c.getId()==id).findFirst().get();

       // return null;
    }

    @Override
    public List<Course> findAll() {

        return courseList.stream().collect(Collectors.toList());
    }

    @Override
    public void save(Course course) {
    courseList.add(course);
    }

    @Override
    public void update(Course course) {
        for (int i = 0; i < courseList.size(); i++) {
            if(courseList.get(i).getId()==course.getId()){
                courseList.set(i,course);
            }

        }
    }

    @Override
    public void deleteById(int id) {
        courseList.removeIf(p->p.getId()==id);

    }
}
