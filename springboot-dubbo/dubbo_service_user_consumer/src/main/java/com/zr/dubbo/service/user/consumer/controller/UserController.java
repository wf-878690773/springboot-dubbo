package com.zr.dubbo.service.user.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zr.dubbo.service.user.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("hi")
    public String sayHi() {
        return userService.sayHi();
    }
}
