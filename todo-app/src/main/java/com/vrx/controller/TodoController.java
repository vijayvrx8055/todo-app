package com.vrx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

@RestController // using this we can send data objects in response
/*@Controller
@ResponseBody*/

/*
AutoConfiguration
--------------------
1. Checks dependencies in classpath
2. Checks for existing configurations
*/
public class TodoController {

    @RequestMapping("/")
    public String home(){
        return "Welcome to TODO-App!!";
    }
}
