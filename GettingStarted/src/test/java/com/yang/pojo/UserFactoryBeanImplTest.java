package com.yang.pojo;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangyang
 * @date 2022/01/12 22:01
 **/
public class UserFactoryBeanImplTest {
    private static final Logger logger = LoggerFactory.getLogger(UserFactoryBeanImplTest.class);

    @Test
    public void userFactoryBeanTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");
        User user = applicationContext.getBean("userFactoryBeanImpl", User.class);
        Assert.assertNotNull(user);
        logger.warn("name: " + user.getName());
    }
}
