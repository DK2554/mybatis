package com.spring.mybatis.service;

import com.spring.mybatis.dao.UserDao;
import com.spring.mybatis.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service

public class UserService {
    private  UserMapper userMapper;
    private UserDao userDao;

    public UserService(UserMapper userMapper, UserDao userDao) {
        this.userMapper = userMapper;
        this.userDao = userDao;
    }

    public List<HashMap<String,Object>> getUsers(){
        return userMapper.selectUsers();
    }
    public List<HashMap<String,Object>> getUsersWithDao(){
        return userDao.getUsers();
    }
}
