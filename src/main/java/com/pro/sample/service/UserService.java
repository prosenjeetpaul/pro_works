package com.pro.sample.service;

import com.pro.sample.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUser(String id){
        return new User("New User" , id);
    }
}
