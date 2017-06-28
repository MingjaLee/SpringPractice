package com.smart;

import com.smart.aspectj.anno.NeedTest;

/**
 * @author jerry
 * @create 17/6/28 12:40
 */
public class NaiveWaiter implements Waiter {
    @NeedTest
    public void greetTo(String clientName) {
        System.out.println("NavieWaiter:greet to " + clientName + "...");
    }

    public void serveTo(String clientName) {
        System.out.println("NavieWaiter:serving " + clientName + "...");
    }
}
