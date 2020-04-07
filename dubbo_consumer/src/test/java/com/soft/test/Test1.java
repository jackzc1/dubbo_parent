package com.soft.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.soft.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class Test1 {

    /*@Autowired*/
    //使用注解的方式
    @Reference
    private UserService userService;

    @Test
    public void test1() {

        String zc = userService.sysHello("zc");
        System.out.println(zc);


    }

}
