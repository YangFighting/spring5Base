package com.yang.pojo;


import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * @author zhangyang
 * @date 2022/01/10 23:06
 **/
public class User {
    private static final Logger logger = LoggerFactory.getLogger(User.class);

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add() {
        logger.warn("add......");
    }
}
