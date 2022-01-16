package com.yang.dao;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 注解Aspect表示 生成代理对象
 *
 * @author zhangyang
 * @date 2022/01/16 13:23
 **/

@Component
@Aspect
public class UserDaoAopProxy implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoAopProxy.class);

    /**
     * 前置通知
     */
    @Before(value = "execution(* com.yang.dao.Impl.UserDaoImpl.update(..))")
    public void before() {
        logger.warn("UserDaoAopProxy before...");
    }

    /**
     * 后置通知（返回通知）
     */
    @AfterReturning(value = "execution(* com.yang.dao.Impl.UserDaoImpl.update(..))")
    public void afterReturning() {
        logger.warn("UserDaoAopProxy afterReturning...");
    }

    /**
     * 最终通知
     */
    @After(value = "execution(* com.yang.dao.Impl.UserDaoImpl.update(..))")
    public void after() {
        logger.warn("UserDaoAopProxy after...");
    }

    /**
     * 异常通知
     */
    @AfterThrowing(value = "execution(* com.yang.dao.Impl.UserDaoImpl.update(..))")
    public void afterThrowing() {
        logger.warn("UserDaoAopProxy afterThrowing...");
    }

    /**
     * 环绕通知
     */
    @Around(value = "execution(* com.yang.dao.Impl.UserDaoImpl.update(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.warn("UserDaoAopProxy around before ...");
        Object obj = proceedingJoinPoint.proceed();
        logger.warn("UserDaoAopProxy around after...");
        return obj;
    }
}
