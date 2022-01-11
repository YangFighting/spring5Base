package com.yang.service;


import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangyang
 * @date 2022/01/11 23:56
 **/
public class UserServiceTest {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceTest.class);

    @Test
    public void addTest() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        Assert.assertNotNull(userService);
        userService.add();

    }

    @Test
    public void getUserObjectTest() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        UserService userService = applicationContext.getBean("userService1", UserService.class);
        Assert.assertNotNull(userService);
        userService.getUserObject();
        logger.warn("user name: " + userService.getUser().getName());

    }

    @Test
    public void getUserObject2Test() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean3.xml");
        UserService userService = applicationContext.getBean("userService2", UserService.class);
        Assert.assertNotNull(userService);
        userService.getUserObject();
        logger.warn("user name: " + userService.getUser().getName());

    }
}
