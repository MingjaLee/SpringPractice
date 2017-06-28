package com.smart;

import com.smart.aspectj.anno.NeedTest;

/**
 * @author jerry
 * @create 17/6/28 12:34
 */
public interface Waiter {
    @NeedTest
    public void greetTo(String clientName);
    public void serveTo(String clientName);
}
