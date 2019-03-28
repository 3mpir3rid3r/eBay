package com.example.demo.service.impl;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserSessionDto;
import com.example.demo.entity.User;
import com.example.demo.entity.UserSessions;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserSessionsRepository;
import com.example.demo.service.UserService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by ashish on 13/5/17.
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    HttpSession session;

    @Autowired
    UserSessionsRepository userSessionsRepository;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public UserDto getUserById(Integer userId) throws Exception {
        User user = userRepository.getOne(userId);
        if (null != user) {
            UserDto dto = new UserDto();
            BeanUtils.copyProperties(user, dto);
            return dto;
        } else {
            throw new Exception("null");
        }
    }

    @Override
    public UserSessionDto getUserSession() throws Exception {
        final UserDto user = (UserDto) session.getAttribute("user");

        UserSessionDto userSessionDto = null;
        if (user != null) {
            userSessionDto = new UserSessionDto();
            userSessionDto.setUserFullName(user.getUserFirstName() + " " + user.getUserLastName());
            userSessionDto.setUserId(user.getUserId());
            userSessionDto.setUserRoll(user.getUserRoll());

            return userSessionDto;
        } else {
            throw new Exception("null");
        }

    }

    @Override
    public boolean login(LoginDto loginDto) throws Exception {
        final List<User> user = userRepository.login(loginDto.getUsername(), loginDto.getPassword());
        if (user.size() == 1) {
            UserDto userDto = new UserDto();

            BeanUtils.copyProperties(user.get(0), userDto);
            userDto.setUserId(user.get(0).getUserId().toString());
            userDto.setUserBdDay(user.get(0).getUserBdDay().toString());

            UserSessions userSessions = new UserSessions();
            userSessions.setUserId(user.get(0).getUserId());
            userSessions.setSessionStart(new Date());

            final UserSessions userSessionsSave = userSessionsRepository.save(userSessions);
            if (null != userSessionsSave && userSessionsSave.getSessionId() > 0) {
                userDto.setSessionId(userSessionsSave.getSessionId().toString());
                session.setAttribute("user", userDto);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public UserSessionDto logout() throws Exception {
        final UserSessionDto userSession = getUserSession();
        if (userSession != null) {

            final UserDto user = (UserDto) session.getAttribute("user");
            final UserSessions sessionUser = userSessionsRepository.getBySessionId(Integer.parseInt(user.getSessionId()));

            sessionUser.setSessionStop(new Date());
            userSessionsRepository.save(sessionUser);

            session.removeAttribute("user");
            session.invalidate();
            return userSession;
        } else {
            throw new Exception("null");
        }
    }

    @Override
    public boolean saveUser(UserDto userDto) throws Exception {
        User user = new User();
        final List<User> users = userRepository.userCheck(userDto.getUserEmail());
        if (null != users && users.isEmpty()) {
            BeanUtils.copyProperties(userDto, user);
            user.setUserBdDay(sdf.parse(userDto.getUserBdDay()));
            final User userSave = userRepository.save(user);
            if (null != userSave) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<UserDto> getAllUsers() throws Exception {
        List<User> all = userRepository.findAll();
        if (!all.isEmpty()) {
            List<UserDto> dtoAll = new ArrayList<>();
            for (User user : all) {
                UserDto dto = new UserDto();
                BeanUtils.copyProperties(user, dto);
                dtoAll.add(dto);
            }
            return dtoAll;
        } else {
            throw new Exception("null");
        }
    }
}
