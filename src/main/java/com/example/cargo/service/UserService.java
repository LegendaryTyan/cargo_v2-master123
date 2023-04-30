package com.example.cargo.service;

import com.example.cargo.dto.UserDto;
import com.example.cargo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
