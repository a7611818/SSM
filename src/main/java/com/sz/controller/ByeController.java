package com.sz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ByeController {

    @RequestMapping("bye")
    public String bye(Model model, HttpServletRequest request){
        model.addAttribute("man","刘德华");
        return "bye";
    }

}
