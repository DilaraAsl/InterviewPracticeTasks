package com.cydeo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Role {
    private Integer id;
    private String name;
}
