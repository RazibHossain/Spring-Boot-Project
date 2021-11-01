package com.razib.springboot.project.springBootProject.controller;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Object hellohome(HttpServletRequest request){
        return "home";
    }


}
