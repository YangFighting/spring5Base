package com.yang.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.yang.dao.Impl.UserDaoImpl;
import com.yang.dao.UserDao;
import com.yang.pojo.User;

/**
 * @author zhangyang
 * @date 2022/01/11 23:45
 **/
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private UserDao userDao;


    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        logger.warn("UserService add...");
        userDao.update();
    }

    public void getUserObject() {
        logger.warn("UserService getUserName...");
        logger.warn("user :" + getUser());
    }
}
