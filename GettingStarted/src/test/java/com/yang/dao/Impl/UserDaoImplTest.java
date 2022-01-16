package com.yang.dao.Impl;

import com.yang.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author zhangyang
 * @date 2022/01/16 13:46
 **/
public class UserDaoImplTest {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImplTest.class);

    @Test
    public void update() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean6.xml");
        UserDao userDao = context.getBean("userDaoImpl", UserDao.class);
        Assert.assertNotNull(userDao);
        logger.warn(userDao.toString());
        userDao.update();

    }
}