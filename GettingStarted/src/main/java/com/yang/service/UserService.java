package com.yang.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.yang.dao.Impl.UserDaoImpl;
import com.yang.dao.UserDao;

/**
 * @author zhangyang
 * @date 2022/01/11 23:45
 **/
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        logger.warn("UserService add...");
        userDao.update();
    }
}
