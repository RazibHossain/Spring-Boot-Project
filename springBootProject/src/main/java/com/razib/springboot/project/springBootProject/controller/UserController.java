package com.razib.springboot.project.springBootProject.controller;

import com.razib.springboot.project.springBootProject.Service.UserService;
import com.razib.springboot.project.springBootProject.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;
//    Users user = new Users();
    @RequestMapping(value = "/Add/",method = RequestMethod.GET)
    public Object userAddView(Model model){
        model.addAttribute("userform", new Users());
        return "/User/Add";
    }

    @RequestMapping(value = "/Add/",method = RequestMethod.POST)
    public Object userAdd(@ModelAttribute("userform") Users user){
        userService.saveUser(user);
        return"/User/List";
    }

    @RequestMapping(value = "/List/",method = RequestMethod.GET)
    public Object userlistView(@ModelAttribute("userform") Users user){
        return "/User/List";
    }
    @RequestMapping(value = "/List/",method = RequestMethod.POST)
    public Object userlistShow(@ModelAttribute("userform") Users user){
        return "/User/List";
    }

}
