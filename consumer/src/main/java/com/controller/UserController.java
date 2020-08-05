package com.controller;

import com.bean.User;
import com.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer/user")

public class  UserController {

    @Autowired
    private UserClient userClient;


    @RequestMapping("{id}")
    public String queryById(@PathVariable Long id){
        User user = userClient.findUser(id);
        return user.toString();
    }
}