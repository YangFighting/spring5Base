package com.yang.dao.Impl;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.yang.dao.UserDao;
import com.yang.pojo.User;

/**
 * @author zhangyang
 * @date 2022/01/11 23:44
 **/
public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public void update() {
        logger.warn("UserDaoImpl update... ");

    }
}
