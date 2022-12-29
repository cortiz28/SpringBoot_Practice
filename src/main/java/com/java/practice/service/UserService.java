package com.java.practice.service;

import com.java.practice.model.Users;
import com.java.practice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<Users> getUsers(){
        return userRepository.findAll();
    }

    public Users getProfile(int id) {
        return userRepository.findById(id).orElse(null);
    }

    public Users addUser(Users users){
        return userRepository.save(users);

    }


}
