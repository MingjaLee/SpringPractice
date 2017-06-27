package com.smart.context;

import com.smart.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

/**
 * @author jerry
 * @create 17/6/27 00:14
 */
public class AnnotationApplicationContextTest {
    @Test
    public void getBean() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
        Car car = ctx.getBean("car", Car.class);
        car.introduce();
        assertNotNull(car);
    }
    //public static void main(String[] args) {
    //    AnnotationApplicationContextTest ctx = new AnnotationApplicationContextTest();
    //    ctx.getBean();
    //}
}
