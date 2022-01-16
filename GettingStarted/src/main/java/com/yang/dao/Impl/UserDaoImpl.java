package com.yang.dao.Impl;


import com.yang.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author zhangyang
 * @date 2022/01/11 23:44
 **/
@Component
public class UserDaoImpl implements UserDao {

    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public void update() {
        logger.warn("UserDaoImpl update... ");

    }
}
