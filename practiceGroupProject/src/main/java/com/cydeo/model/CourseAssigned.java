package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public class CourseAssigned {
    private Course course;
    private User user;
    private CourseStatus status;
}
