package com.hy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello feign2";
    }

    @RequestMapping("/hello1")
    public String hello1(@RequestParam String name){
        return "hello"+name;
    }
}
