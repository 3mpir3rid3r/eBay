package com.example.demo.controller;

import java.util.List;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserSessionDto;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import com.example.demo.utils.Constants;

import javax.servlet.http.HttpSession;

/**
 * Created by ashish on 13/5/17.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(Constants.GET_USER_BY_ID)
    public UserDto getUserById(@PathVariable Integer userId) {
        try {
            return userService.getUserById(userId);
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping(Constants.GET_ALL_USERS)
    public List<UserDto> getAllUsers() {
        try {
            return userService.getAllUsers();
        } catch (Exception e) {
        }
        return null;
    }

    @PostMapping(value = Constants.SAVE_USER)
    public boolean saveUser(@RequestBody UserDto userDto) {
        try {
            return userService.saveUser(userDto);
        } catch (Exception e) {
            return false;
        }
    }

    @PostMapping(value = Constants.LOGIN_BY_USER)
    public boolean loginUser(@RequestBody LoginDto loginDto) {
        final boolean loginUser;
        try {
            return userService.login(loginDto);
        } catch (Exception e) {
            return false;
        }
    }

    @GetMapping(value = Constants.GET_USER_SESSION)
    public UserSessionDto getUser() {
        try {
            return userService.getUserSession();
        } catch (Exception e) {
            return null;
        }
    }

    @GetMapping(value = Constants.LOGOUT_BY_USER)
    public UserSessionDto logout() {
        try {
            return userService.logout();
        } catch (Exception e) {
            return null;
        }
    }


}
