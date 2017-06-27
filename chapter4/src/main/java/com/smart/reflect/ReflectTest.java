package com.smart.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author jerry
 * @create 17/6/26 20:44
 */
public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable {
        //1.ClassLoader -> Car类对象
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.smart.reflect.Car");

        //2.获取类的默认构造函数,并用它实例化Car
        Constructor cons = clazz.getDeclaredConstructor( (Class[])null );
        Car car = (Car)cons.newInstance();

        //3.通过反射方法设置属性
        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "红旗CA72");
        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "黑色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);
        return car;
    }

    public static void main(String[] args) throws Throwable {
        //Car car = initByDefaultConst();
        //car.introduce();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("com.smart.reflect.PrivateCar");
        PrivateCar pcar = (PrivateCar)clazz.newInstance();
        Field colorFld = clazz.getDeclaredField("color");

        //1.取消安全检查
        colorFld.setAccessible(true);
        colorFld.set(pcar, "红色");

        Method driveMtd = clazz.getDeclaredMethod( "dirve", (Class[])null );
        driveMtd.setAccessible(true);
        driveMtd.invoke( pcar, (Object[])null );

    }
}
