package com.sz.controller;

import com.sz.pojo.User;
import com.sz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {
    //s
    @Autowired
    private UserService userService;


    @ResponseBody
    @RequestMapping("/all")
    public List<User> login(){
        return userService.queryAll();
    }
}
