package com.User.User.Service.service;


import com.User.User.Service.entity.User;
import com.User.User.Service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public User submitUserData(User user)

    {
        user.setActive(true);
        return userRepository.save(user);
    }
    public ArrayList<User> retrieveAllUserData(){
        return userRepository.findAll();


    }
 /*  public User getUserData(Integer userName) {

        return userRepository.findAllByUserId(userName);
    }*/

}


