package service;

import entity.Parent;

import java.util.List;
import java.util.stream.Collectors;

import static database.Database.parentList;
import static database.Database.schoolList;

public class ParentService implements CRUDService<Parent> {
    @Override
    public Parent findById(int id) {
        return  parentList.stream().filter(school -> school.getId()==id).findAny().get();
    }

    @Override
    public List<Parent> findAll() {
        return parentList.stream().collect(Collectors.toList());
    }

    @Override
    public void save(Parent parent) {
       parentList.add(parent);
    }

    @Override
    public void update(Parent parent) {
        for (int i = 0; i <parentList.size() ; i++) {
            if(parentList.get(i).getId()==parent.getId()){
                parentList.set(i,parent);
            }
    }}

    @Override
    public void deleteById(int id) {
            parentList.removeIf(p->p.getId()==id);
    }
}
