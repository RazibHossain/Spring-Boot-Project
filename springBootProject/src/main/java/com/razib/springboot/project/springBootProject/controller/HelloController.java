package com.razib.springboot.project.springBootProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object hellohome(HttpServletRequest request){
        return "home";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Object login(HttpServletRequest request){
        return "login";
    }


}
