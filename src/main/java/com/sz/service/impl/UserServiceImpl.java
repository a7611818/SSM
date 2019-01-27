package com.sz.service.impl;

import com.sz.mapper.UserMapper;
import com.sz.pojo.User;
import com.sz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> queryAll() {
        return userMapper.queryAll();
    }

}
