package com.hy.eurekafeignclient.controller;

import com.hy.eurekafeignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignService feignService;

    @RequestMapping("/hi")
    public String hello(){
       return feignService.sayHello();
    }

    @RequestMapping("/hello")
    public String hello1(){
        String name="张三";
       return feignService.hello1(name);
    }

}
