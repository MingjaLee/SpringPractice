package com.smart.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jerry
 * @create 17/6/27 15:51
 */
public class PerformaceHandler implements InvocationHandler {
    private Object target;

    public PerformaceHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformaceMonitor.begin( target.getClass().getName() + "." + method.getName() );
        Object obj = method.invoke(target, args);
        PerformaceMonitor.end();
        return obj;
    }
}
