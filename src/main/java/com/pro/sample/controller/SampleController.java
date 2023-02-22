package com.pro.sample.controller;

import com.pro.sample.model.User;
import com.pro.sample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/hello")
    public String message(){
        return "Hello!!!";
    }

    @GetMapping(value = "/user/{id}")
    public User user(@PathVariable String id){
        return userService.getUser(id);
    }
}
