package com.example.UserManagementSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="user")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String city;
    private boolean deleted;

    @ManyToMany
    @JoinTable(
            name = "course_follow",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> followedCourses = new HashSet<>();

    public void followCourse(Course course){
        followedCourses.add(course);
    }
}
