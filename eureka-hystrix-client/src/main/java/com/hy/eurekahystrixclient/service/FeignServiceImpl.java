package com.hy.eurekahystrixclient.service;

import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService{
    public String sayHello() {
        return "出错啦！！";
    }

    public String hello1(String name) {
        return "出错啦！！";
    }
}
