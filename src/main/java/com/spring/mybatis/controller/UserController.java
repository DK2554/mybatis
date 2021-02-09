package com.spring.mybatis.controller;

import com.spring.mybatis.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<HashMap<String,Object>> getUser(){
        return service.getUsers();

    }
    @GetMapping("/usersDao")
    public List<HashMap<String,Object>> getUserDao(){
        return service.getUsersWithDao();

    }


}
