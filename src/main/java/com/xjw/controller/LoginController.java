package com.xjw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/hello")
    public String login(){
        System.out.println("hello login");
        return "success";
    }
}
