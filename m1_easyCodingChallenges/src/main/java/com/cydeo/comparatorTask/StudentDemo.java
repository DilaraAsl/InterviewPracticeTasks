package com.cydeo.comparatorTask;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>(Arrays.asList(
                new Student(111,"Mayank","London"),
                new Student(131,"Ancul","New York City"),
                new Student(121,"Solanki","Jaipur"),
                new Student(101,"Aggarwal","Hong Kong")
        ));

        List<Student> newStudentList= studentList.stream().sorted(Comparator.comparing(Student::getRollNo))
                        .collect(Collectors.toList());
        System.out.println(newStudentList);


        Collections.sort(studentList,new SortByRoll());
        System.out.println(studentList);
    }

}
