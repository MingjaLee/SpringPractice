package com.smart.beanfactory;

import com.smart.Car;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.testng.annotations.Test;

/**
 * @author jerry
 * @create 17/6/26 23:43
 */
public class BeanFactoryTest {
    @Test
    public void getBean() throws Throwable {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource res = resolver.getResource("classpath:com/smart/beanfactory/beans.xml");
        System.out.println(res.getURL());

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);

        System.out.println("init BeanFactory.");

        Car car = factory.getBean( "car", Car.class );
        System.out.println("car bean is ready for use!");
        car.introduce();
    }
    //
    //public static void main(String[] args) {
    //    BeanFactoryTest bft = new BeanFactoryTest();
    //    try {
    //        bft.getBean();
    //    } catch (Throwable throwable) {
    //        throwable.printStackTrace();
    //    }
    //}
}
