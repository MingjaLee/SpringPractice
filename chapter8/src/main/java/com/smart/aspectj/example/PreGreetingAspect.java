package com.smart.aspectj.example;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author jerry
 * @create 17/6/28 12:46
 */
@Aspect //注解为一个切面
public class PreGreetingAspect {

    @Before( "execution(* greetTo(..))" ) //定义切点和增强类型
    public void beforeGreeting() { //增强的横切逻辑
        System.out.println("How are you");
    }
}
