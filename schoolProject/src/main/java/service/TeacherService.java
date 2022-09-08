package service;

import entity.Teacher;

import java.util.List;
import java.util.stream.Collectors;

import static database.Database.*;

public class TeacherService implements CRUDService<Teacher>{
    @Override
    public Teacher findById(int id) {
        return teacherList.stream().filter(c->c.getId()==id).findFirst().get();
    }

    @Override
    public List<Teacher> findAll() {
        return teacherList.stream().collect(Collectors.toList());
    }

    @Override
    public void save(Teacher teacher) {
        teacherList.add(teacher);
    }

    @Override
    public void update(Teacher teacher) {
        for (int i = 0; i < teacherList.size(); i++) {
            if(teacherList.get(i).getId()==teacher.getId()){
                teacherList.set(i,teacher);
            }

        }
    }

    @Override
    public void deleteById(int id) {
        teacherList.removeIf(t->t.getId()==id);
    }
}
