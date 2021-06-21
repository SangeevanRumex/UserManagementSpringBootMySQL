package com.example.UserManagementSpringBoot.service;

import com.example.UserManagementSpringBoot.model.User;
import com.example.UserManagementSpringBoot.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    boolean addUser(User user);
    boolean updateUser(User user);
//    boolean updateUser(UserDto userDto);
//    boolean deleteUser(int id);
    List<User> getUsers();
    User getUserById(int id);
//    List<UserDto> getUsers();
//    UserDto getUserById(int id);
    boolean followCourse(int userId, int courseId);
}
