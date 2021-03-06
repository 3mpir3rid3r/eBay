package com.example.demo.repository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ashish on 13/5/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM `user` WHERE user_email=?1 and user_password=?2 ", nativeQuery = true)
    List<User> login(String email, String password);

    @Query(value = "SELECT * FROM `user` WHERE user_email=?1 ", nativeQuery = true)
    List<User> userCheck(String email);
}
