package com.yang.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author zhangyang
 * @date 2022/01/10 23:13
 **/

public class UserTest {
    private static final Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void addTest() {
        // 1 加载 spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2 获取配置创建对象
        User user = context.getBean("user", User.class);
        Assert.assertNotNull(user);
        user.add();
    }

    @Test
    public void add1Test() {

        // 工厂类
        class UserFactory {

            public User getUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
                // 解析xml 获得 class属性值
                String classValue = "com.yang.pojo.User";
                // 反射，创建对象
                Class aClass = Class.forName(classValue);
                return (User) aClass.newInstance();
            }
        }

        UserFactory userFactory = new UserFactory();
        try {
            // 通过工厂，获取对象
            User user = userFactory.getUser();
            Assert.assertNotNull(user);
            user.add();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void user1Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        User user1 = context.getBean("user1", User.class);
        Assert.assertNotNull(user1);
        logger.warn(user1.toString());
        logger.warn("name: " + user1.getName());
    }

    @Test
    public void user2Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        User user2 = context.getBean("user2", User.class);
        Assert.assertNotNull(user2);
        logger.warn(user2.toString());
        logger.warn("name: " + user2.getName());

        context = new ClassPathXmlApplicationContext("bean2.xml");
        User user1 = context.getBean("user1", User.class);
        Assert.assertNotNull(user1);
        logger.warn(user1.toString());
        logger.warn("name: " + user1.getName());

    }

    @Test
    public void user3Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        User user3 = context.getBean("user3", User.class);
        Assert.assertNotNull(user3);
        logger.warn(user3.toString());
        logger.warn("name: " + user3.getName());


    }

    @Test
    public void user4Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        User user4 = context.getBean("user4", User.class);
        Assert.assertNotNull(user4);
        logger.warn(user4.toString());

        logger.warn("courses: ");
        Arrays.stream(user4.getCourses()).forEach(logger::warn);

        logger.warn("list: ");
        user4.getList().forEach(logger::warn);

        logger.warn("maps: ");
        user4.getMaps().forEach((k, v) -> logger.warn(k + ":" + v));

        logger.warn("sets: ");
        user4.getSets().forEach(logger::warn);
    }

    @Test
    public void user5Test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        User user5 = context.getBean("user5", User.class);
        Assert.assertNotNull(user5);
        logger.warn(user5.toString());


        logger.warn("list: ");
        user5.getList().forEach(logger::warn);
    }


}
