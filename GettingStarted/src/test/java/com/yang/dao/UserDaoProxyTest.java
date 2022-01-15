package com.yang.dao;

import com.yang.dao.Impl.UserDaoImpl;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author zhangyang
 * @date 2022/01/16 0:25
 **/
public class UserDaoProxyTest extends TestCase {

    public void testNewProxyInstance() {

        UserDaoImpl userDao = new UserDaoImpl();
        UserDaoProxy userDaoProxy = new UserDaoProxy();
        UserDao proxyInstance = (UserDao)userDaoProxy.newProxyInstance(userDao);
        proxyInstance.update();

    }
}