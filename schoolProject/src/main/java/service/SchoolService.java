package service;

import entity.School;

import java.util.List;
import java.util.stream.Collectors;

import static database.Database.schoolList;

public class SchoolService implements CRUDService<School>{
    @Override
    public School findById(int id) {
        return  schoolList.stream().filter(school -> school.getId()==id).findAny().get();
    }

    @Override
    public List<School> findAll() {
        return schoolList.stream().collect(Collectors.toList());
    }

    @Override
    public void save(School school) {
        schoolList.add(school);
    }

    @Override
    public void update(School school) {
        for (int i = 0; i <schoolList.size() ; i++) {
            if(schoolList.get(i).getId()==school.getId()){
                schoolList.set(i,school);
            }
            else System.err.println("No such school in the list!");
            

        }
        }



    @Override
    public void deleteById(int id) {

        schoolList.removeIf(school->school.getId()==id);

    }
}
