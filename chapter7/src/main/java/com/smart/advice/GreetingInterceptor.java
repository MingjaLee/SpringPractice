package com.smart.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author jerry
 * @create 17/6/27 21:12
 */
public class GreetingInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();
        String clientName = (String)args[0];
        System.out.println("How are you! Mr." + clientName + ".");

        Object obj = methodInvocation.proceed();

        System.out.println("Please enjoy yourself!");
        return obj;
    }
}
