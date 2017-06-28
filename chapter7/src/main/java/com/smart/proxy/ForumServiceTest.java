package com.smart.proxy;

import org.testng.annotations.Test;

import java.lang.reflect.Proxy;

/**
 * @author jerry
 * @create 17/6/27 16:00
 */
public class ForumServiceTest {
    @Test
    public void proxy() {
        //ForumService target = new ForumServiceImpl();
        //
        //PerformaceHandler handler = new PerformaceHandler(target);
        //
        //ForumService proxy = (ForumService) Proxy.newProxyInstance(
        //        target.getClass().getClassLoader(),
        //        target.getClass().getInterfaces(),
        //        handler);
        //
        //proxy.removeForum(10);
        //proxy.removeTopic(1012);

        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl)proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(1023);
    }
}
