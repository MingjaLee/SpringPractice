package com.smart.proxy;

/**
 * @author jerry
 * @create 17/6/27 15:44
 */
public class MethodPerformace {
    private long begin;
    private long end;
    private String serviceMethod;

    public MethodPerformace(String serviceMethod) {
        reset(serviceMethod);
    }

    public void printPerformace() {
        end = System.currentTimeMillis();
        long elapse = end - begin;
        System.out.println(serviceMethod + "花费" + elapse + "秒!");
    }

    public void reset(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }
}
