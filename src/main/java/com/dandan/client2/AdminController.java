package com.dandan.client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("c")
public class AdminController {

    @Value("${server.port}")
    String port;
    @GetMapping("hello")
    public String hello(@RequestParam String name){

        return "hello "+name+" 我的服务端口是："+port;
    }


}
