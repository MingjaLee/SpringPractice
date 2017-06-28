package com.smart.advice;

/**
 * @author jerry
 * @create 17/6/27 20:31
 */
public class NaiveWaiter implements Waiter {
    public void greetTo(String name) {
        System.out.println("greet to " + name + "...");
    }

    public void serveTo(String name) {
        System.out.println("serving " + name + "...");
    }
}
