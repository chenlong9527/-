package com.hy.eurekafeignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name="eureka-provider")
public interface FeignService {
    @RequestMapping("/hello")
    String sayHello();

    @RequestMapping("/hello1")
    String hello1(@RequestParam String name);
}
