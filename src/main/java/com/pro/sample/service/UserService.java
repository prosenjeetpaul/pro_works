package com.pro.sample.service;

import com.pro.sample.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public User getUser(String id){
        return new User("New User" , id);
    }

    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        User u1 = new User("Jack","001");
        User u2 = new User("Jill","002");
        User u3 = new User("Tom","003");
        users.add(u1);
        users.add(u2);
        users.add(u3);
        return users;
    }
}
