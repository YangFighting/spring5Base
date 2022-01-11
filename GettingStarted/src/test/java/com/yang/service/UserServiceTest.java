package com.yang.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangyang
 * @date 2022/01/11 23:56
 **/
public class UserServiceTest {

    @Test
    public void addTest(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        Assert.assertNotNull(userService);
        userService.add();

    }
}
