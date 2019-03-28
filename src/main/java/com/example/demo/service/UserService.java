package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserSessionDto;
import com.example.demo.entity.User;

import javax.servlet.http.HttpSession;

/**
 * Created by ashish on 13/5/17.
 */
public interface UserService {
    UserDto getUserById(Integer userId) throws Exception;

    UserSessionDto getUserSession() throws Exception;

    boolean login(LoginDto loginDto) throws Exception;

    UserSessionDto logout() throws Exception;

    boolean saveUser(UserDto userDto) throws Exception;

    List<UserDto> getAllUsers() throws Exception;
}
