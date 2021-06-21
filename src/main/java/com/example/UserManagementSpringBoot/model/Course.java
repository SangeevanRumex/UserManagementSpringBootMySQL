package com.example.UserManagementSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="course")
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String courseName;
    private int fee;
    private boolean deleted;

    @ManyToMany(mappedBy = "followedCourses")
    private Set<User> follows = new HashSet<>();
}
