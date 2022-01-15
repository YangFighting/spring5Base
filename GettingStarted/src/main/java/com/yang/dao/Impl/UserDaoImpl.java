package com.yang.dao.Impl;


import com.yang.dao.UserDao;
import com.yang.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
