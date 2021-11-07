package com.razib.springboot.project.springBootProject.controller;

import com.razib.springboot.project.springBootProject.Service.BatchService;
import com.razib.springboot.project.springBootProject.model.Batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Batch")
public class BatchController {

    @Autowired
    BatchService batchService;

    @RequestMapping(value = "/Add/",method = RequestMethod.GET)
    public Object batchAddView(Model model){
        model.addAttribute("batchform", new Batch());
        return "/Batch/Add";
    }

    @RequestMapping(value = "/Add/",method = RequestMethod.POST)
    public Object userAdd(@ModelAttribute("batchform") Batch batch){
        batchService.saveBatch(batch);
        return  "redirect:/Batch/List/";
//        return"/User/List";
    }

//    @RequestMapping(value = "/Add/",method = RequestMethod.GET)
//    public Object userAddView(Model model){
//        model.addAttribute("userform", new Users());
//        return "/User/Add";
//    }
//
//    @RequestMapping(value = "/Add/",method = RequestMethod.POST)
//    public Object userAdd(@ModelAttribute("userform") Users user){
//        userService.saveUser(user);
//        return  "redirect:/User/List/";
////        return"/User/List";
//    }
//
//    @RequestMapping(value = "/Add/",method = RequestMethod.GET)
//    public Object userAddView(Model model){
//        model.addAttribute("userform", new Users());
//        return "/User/Add";
//    }
//
//    @RequestMapping(value = "/Add/",method = RequestMethod.POST)
//    public Object userAdd(@ModelAttribute("userform") Users user){
//        userService.saveUser(user);
//        return  "redirect:/User/List/";
////        return"/User/List";
//    }
//
//    @RequestMapping(value = "/Delete/{id}/",method = RequestMethod.GET)
//    public Object userDeleteView(@PathVariable Integer id){
//        userService.deleteById(id);
////        return "/User/Edit";
//        return  "redirect:/User/List/";
//    }
}
