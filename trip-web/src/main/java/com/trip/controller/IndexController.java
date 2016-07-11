package com.trip.controller;

import com.trip.model.User;
import com.trip.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView home(ModelAndView modelAndView){
        modelAndView.addObject("name", "trip");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/users")
    public ModelAndView users(ModelAndView modelAndView){

        List<User> users = userService.getUsers();

        modelAndView.addObject("users", users);
        modelAndView.setViewName("users");
        return modelAndView;
    }

}
