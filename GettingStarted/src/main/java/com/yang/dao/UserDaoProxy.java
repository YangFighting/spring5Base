package com.yang.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangyang
 * @date 2022/01/16 0:01
 **/
public class UserDaoProxy implements InvocationHandler {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoProxy.class);
    /**
     * 代理的目标对象
     */
    private Object targetObject;


    @Override
    //增强的逻辑
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.warn("UserDaoProxy invoke...");
        return method.invoke(targetObject, args);
    }

    /**
     * 生产动态代理的核心方法
     *
     * @param targetObject 代理的目标对象
     * @return 返回目标对象的代理类
     */
    public Object newProxyInstance(Object targetObject) {
        // 指定目标对象，用于调用目标对象的方法
        this.targetObject = targetObject;

        // 实现动态代理的核心——调用 Proxy.newProxyInstance方法
        // 第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器
        // 第二个参数要实现和目标对象一样的接口
        // 第三个参数：实现这个接口 InvocationHandler，创建代理对象，写增强的部分

        // 返回代理类
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), this);

    }

}
