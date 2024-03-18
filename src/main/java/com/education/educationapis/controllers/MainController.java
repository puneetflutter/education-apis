package com.education.educationapis.controllers;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 

@Controller
public class MainController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {
        System.out.println("inside about handler ......");
        return "about";
    }
}

