package com.smart.aspectj.example;

import com.smart.NaiveWaiter;
import com.smart.Waiter;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @author jerry
 * @create 17/6/28 13:00
 */
public class AspectJProxyTest {
    public static void main(String[] args) {
        Waiter target = new NaiveWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        factory.setTarget(target);
        factory.addAspect(PreGreetingAspect.class);
        Waiter proxy = factory.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("Tom");
    }
}
