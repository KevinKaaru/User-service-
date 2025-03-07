package com.User.User.Service.controller;


import com.User.User.Service.entity.User;
import com.User.User.Service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/userService/add")

    public User saveUserData(@RequestBody User user) {
        return userService.submitUserData(user);

    }

    @GetMapping("/getUserDetails")
    public ArrayList<User> getAllUserData() {
        return userService.retrieveAllUserData();
    }
    /*@GetMapping("/getaAllUsers/{userName}")
   public ArrayList<User>  getUserData(@PathVariable("userName") String userName) {

        ArrayList<User> result = userService.retrieveAllUserData(userName);
        return result;
    }*/





}
