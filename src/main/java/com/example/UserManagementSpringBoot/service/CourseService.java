package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.Course;
import com.example.UserManagementSpringBoot.model.dto.CourseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    boolean addCourse(Course course);
//    boolean updateCourse(CourseDto courseDto);
//    boolean deleteCourse(int id);
//    List<CourseDto> getCourses();
    Course getCourseById(int id);
}
