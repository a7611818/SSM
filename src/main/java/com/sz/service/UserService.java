package com.sz.service;

import com.sz.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    /**
     * 查询所有账号
     */
    List<User> queryAll();

}
