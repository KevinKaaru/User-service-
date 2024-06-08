package com.User.User.Service.repository;

import com.User.User.Service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    ArrayList<User> findAll();
    User save(User user);
    // User findAllByUserId(String userName);




}
