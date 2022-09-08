package service;

import entity.Student;

import java.util.List;
import java.util.stream.Collectors;

import static database.Database.studentList;
import static database.Database.teacherList;


public class StudentService implements CRUDService<Student>{
    @Override
    public Student findById(int id) {
        return studentList.stream().filter(c->c.getId()==id).findFirst().get();
    }

    @Override
    public List<Student> findAll() {
        return studentList.stream().collect(Collectors.toList());
    }

    @Override
    public void save(Student student) {
    studentList.add(student);
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId()==student.getId()){
               studentList.set(i,student);
            }

        }

    }

    @Override
    public void deleteById(int id) {
        studentList.removeIf(s->s.getId()==id);
    }
}
