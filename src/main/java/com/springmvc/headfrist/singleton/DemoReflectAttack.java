package com.springmvc.headfrist.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射的方式来实例化该类
 * <p>Title:DemoReflectAttack</p>
 * @author liuwanlin
 * @date 2017年11月29日下午5:54:05
 */
public class DemoReflectAttack {
 
	public static void main(String[] args) throws NoSuchMethodException, 
	SecurityException, 
	InstantiationException, IllegalAccessException, 
	IllegalArgumentException, InvocationTargetException {
		
		Class<?> type=Demo.class;
		//反射是可以获取类的构造函数，再加一行 setAccessible(true);
		Constructor<?> c= type.getDeclaredConstructor(null);
		c.setAccessible(true);
		Demo demo1= (Demo) c.newInstance();
		Demo demo2= Demo.getInstance();
		
		System.out.println(demo1==demo2);
	}
}
