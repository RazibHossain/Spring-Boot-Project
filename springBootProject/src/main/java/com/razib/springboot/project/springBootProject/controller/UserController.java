package com.razib.springboot.project.springBootProject.controller;

import com.razib.springboot.project.springBootProject.Service.UserService;
import com.razib.springboot.project.springBootProject.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.awt.*;

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
        return  "redirect:/User/List/";
//        return"/User/List";
    }

    @RequestMapping(value = "/List/",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView userlistView(){
        ModelAndView mv = new ModelAndView("/User/List");
        mv.addObject("user_list",userService.findUsers());
        return mv;
    }
    @RequestMapping(value = "/List/",method = RequestMethod.POST)
    public Object userlistShow(@ModelAttribute("userform") Users user){
        return "/User/List";
    }

    @RequestMapping(value = "/Edit/{id}/",method = RequestMethod.GET)
    public Object userEditView(@PathVariable Integer id, Model model){
        model.addAttribute("userform", userService.findUser(id));
        return "/User/Edit";
    }
    @RequestMapping(value = "/Edit/",method = RequestMethod.POST)
    public Object userEditPost(@ModelAttribute("userform") Users user){
        userService.updateUser(user);
        return  "redirect:/User/List/";
    }
    @RequestMapping(value = "/Delete/{id}/",method = RequestMethod.GET)
    public Object userDeleteView(@PathVariable Integer id){
    userService.deleteById(id);
//        return "/User/Edit";
        return  "redirect:/User/List/";
    }
}
