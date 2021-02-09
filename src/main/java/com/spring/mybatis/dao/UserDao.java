package com.spring.mybatis.dao;


import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class UserDao {

    private  SqlSession sqlsession;

    public UserDao(SqlSession sqlsession) {
        this.sqlsession = sqlsession;
    }

    public List<HashMap<String,Object>> getUsers(){
        return sqlsession.selectList("com.spring.mybatis.mapper.UserMapper.selectUsers");
    }
}
