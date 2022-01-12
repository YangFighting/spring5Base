package com.yang.pojo;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhangyang
 * @date 2022/01/12 21:57
 **/
public class UserFactoryBeanImpl implements FactoryBean<User> {
    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("FactoryBean 张三");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}

