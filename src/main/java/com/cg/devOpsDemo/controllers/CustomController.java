package com.cg.devOpsDemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @RequestMapping("/")
    public String login(){
        return "Login Page";
    }


}
