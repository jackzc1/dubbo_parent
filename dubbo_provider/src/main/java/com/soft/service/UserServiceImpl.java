package com.soft.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService {
    public String sysHello(String msg) {
        System.out.println("被远程调用了" + msg);
        return "hello" + msg;
    }
}
