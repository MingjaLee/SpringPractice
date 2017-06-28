package com.smart.aspectj.fun;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author jerry
 * @create 17/6/28 14:58
 */
@Aspect
public class TestAspect {
    @AfterReturning("@annotation(com.smart.anno.NeedTest)")
    public void needTestFun() {
        System.out.println("needTestFun() executed!");
    }
}
