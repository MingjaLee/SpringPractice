package com.smart.advisor;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * @author jerry
 * @create 17/6/27 21:45
 */
////切面 切点

public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {

    public boolean matches(Method method, Class clazz) {
        return "greetTo".equals(method.getName());
    }

    public ClassFilter getClassFilter(){
        return new ClassFilter(){
            public boolean matches(Class clazz){
                return Waiter.class.isAssignableFrom(clazz);
            }
        };

    }
}
