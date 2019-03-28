package com.example.demo.repository;

import com.example.demo.entity.UserSessions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSessionsRepository extends JpaRepository<UserSessions, Integer> {

     UserSessions getBySessionId(Integer id);
}
