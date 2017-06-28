package com.smart.advisor;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author jerry
 * @create 17/6/27 21:55
 */



public class GreetingBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] args, Object obj) throws Throwable {
        String clientName = (String)args[0];
        System.out.println(obj.getClass().getName()+"."+method.getName());
        System.out.println("How are you！Mr."+clientName+".");
    }
}
