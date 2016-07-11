package com.trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView home(ModelAndView modelAndView){
        modelAndView.addObject("name", "trip");
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
