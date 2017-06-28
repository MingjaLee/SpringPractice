package com.smart.autoproxy;

import com.smart.advisor.Waiter;
import com.smart.advisor.Seller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jerry
 * @create 17/6/28 10:09
 */
public class Test {
    public static void main(String[] args) {
        String configPath = "com/smart/autoproxy/beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);

        Waiter waiter = (Waiter)ctx.getBean("waiter");
        Seller seller = (Seller)ctx.getBean("seller");
        waiter.greetTo("John");
        waiter.serveTo("John");
        seller.greetTo("Tom");
    }
}
