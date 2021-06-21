package com.example.UserManagementSpringBoot.model.dto;

import com.example.UserManagementSpringBoot.model.Course;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int id;
    private String userName;
    private String city;
    private Set<Course> followedCourses;
}
