package com.java.practice.controller;


import com.java.practice.model.Users;
import com.java.practice.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<Users> users(){

        return userService.getUsers();
    }

//display data to the url
    @GetMapping("/users/profile/{id}")
    public Users userProfile(@PathVariable int id){
//        User usr = userService.findById(id);
        Users usr = userService.getProfile(id);

        return usr;
    }


//    add users to database
    @PostMapping("/users_add")
    public Users addUser(@RequestBody Users usr){

        return userService.addUser(usr);
    }





}
