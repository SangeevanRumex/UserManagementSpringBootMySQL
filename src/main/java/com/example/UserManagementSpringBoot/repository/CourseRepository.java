package com.example.UserManagementSpringBoot.repository;

import com.example.UserManagementSpringBoot.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    @Query(value = "SELECT * FROM course WHERE id = :id AND deleted IS NOT TRUE", nativeQuery = true)
    Course getCourseById(@Param("id")int id);
}
