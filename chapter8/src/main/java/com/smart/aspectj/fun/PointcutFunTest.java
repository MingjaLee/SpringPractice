package com.smart.aspectj.fun;

import com.smart.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

/**
 * @author jerry
 * @create 17/6/28 15:03
 */
public class PointcutFunTest {
    public static void main(String[] args) {
        String configPath = "com/smart/aspectj/fun/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        //Waiter naiveWaiter = (Waiter)ctx.getBean("naiveWaiter");
        //Waiter naughtyWaiter = (Waiter)ctx.getBean("naughtyWaiter");
        //naiveWaiter.greetTo("John");
        //naughtyWaiter.greetTo("Tom");
    }
    //@Test
    //public void pointcut() {
    //    String configPath = "com/smart/aspectj/fun/beans.xml";
    //    ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
    //    Waiter naiveWaiter = (Waiter)ctx.getBean("naiveWaiter");
    //    Waiter naughtyWaiter = (Waiter)ctx.getBean("naughtyWaiter");
    //    naiveWaiter.greetTo("John");
    //    naughtyWaiter.greetTo("Tom");
    //}
}
