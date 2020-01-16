package com.zr.dubbo.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zr.dubbo.service.user.api.UserService;
import org.springframework.beans.factory.annotation.Value;

@Service(interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {



    @Override
    public String sayHi() {

        return "hello dubbo" ;
    }
}
