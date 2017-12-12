package com.smart.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thinkpad on 2017/12/10.
 */
@RestController
public class HelloController {

    @Autowired
    private ApplicationContext ctx;

    @GetMapping("/hello")
    public String hello(){
        String name = ctx.getEnvironment().getProperty("username1");
        return "hello:" + name;
    }

    @GetMapping("/hello2")
    public String hello2(){
        String name = ctx.getEnvironment().getProperty("username1");
        return "hello:" + name;
    }
}
