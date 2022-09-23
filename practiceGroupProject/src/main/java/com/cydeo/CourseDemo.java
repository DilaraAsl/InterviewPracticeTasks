package com.cydeo;

import com.cydeo.model.Course;
import com.cydeo.model.CourseStatus;
import com.cydeo.service.DataGenerator;
import com.cydeo.service.Implementation;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class CourseDemo {
    public static void main(String[] args) {

        Map<CourseStatus,Long> statusMap=Implementation.countCoursesByStatus();
       for(Map.Entry<CourseStatus,Long> entry: statusMap.entrySet()){
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
    // Implementation.getMinMaxCourseDuration().forEach((k, v)-> System.out.println(k+" "+v));

   //     System.out.println(Implementation.findFirstWithFirstName());
    //    Implementation.partitionOfConfirmedUsers().forEach((k,v)-> System.out.println(k+" "+v));
Implementation.groupOfCourseAssigned().forEach((k,v)-> System.out.println(k+" "+v));
    }
}
