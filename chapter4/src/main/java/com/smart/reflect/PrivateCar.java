package com.smart.reflect;

/**
 * @author jerry
 * @create 17/6/26 20:26
 */
public class PrivateCar {
    private String color;
    protected void dirve() {
        System.out.println("drive private car! the color is: " + color);
    }
}
