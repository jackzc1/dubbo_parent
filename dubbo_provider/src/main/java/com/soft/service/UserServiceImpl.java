package com.soft.service;

public class UserServiceImpl implements UserService {
    public String sysHello(String msg) {
        System.out.println("被远程调用了" + msg);
        return "hello" + msg;
    }
}
