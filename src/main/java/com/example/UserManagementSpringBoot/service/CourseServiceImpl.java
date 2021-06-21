package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.Course;
import com.example.UserManagementSpringBoot.model.User;
import com.example.UserManagementSpringBoot.model.dto.CourseDto;
import com.example.UserManagementSpringBoot.model.dto.UserDto;
import com.example.UserManagementSpringBoot.repository.CourseRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public boolean addCourse(CourseDto courseDto) {
        courseRepository.save(convertFromDto(courseDto));
        return true;
    }

//    @Override
//    public boolean updateCourse(CourseDto courseDto) {
//        return true;
//    }
//
//    @Override
//    public boolean deleteCourse(int id) {
//        return true;
//    }
//
//    @Override
//    public List<CourseDto> getCourses() {
//        return null;
//    }

    @Override
    public CourseDto getCourseById(int id) {
        Course oldCourse = courseRepository.getCourseById(id);
        if(oldCourse!=null) {
            return convertToDto(courseRepository.getCourseById(id));
        }
        return null;
    }

    public CourseDto convertToDto(Course course) {
        CourseDto courseDto = modelMapper.map(course, CourseDto.class);
        return courseDto;
    }

    public Course convertFromDto(CourseDto courseDto) {
        Course course = modelMapper.map(courseDto, Course.class);
        return course;
    }
}
