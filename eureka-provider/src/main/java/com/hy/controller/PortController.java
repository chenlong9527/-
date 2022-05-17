package com.hy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.sampled.Port;

@RestController
public class PortController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/port")
    public String getPort(){

        return  String.format("当前服务为："+port);

    }
}
