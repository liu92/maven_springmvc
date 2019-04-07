package com.springmvc.headfrist.adaptermode;

/**
 * ClassName: Adaptee
 * Description: 而源角色Adaptee是一个具体类，它有一个sampleOperation1()方法，但是没有sampleOperation2()方法。
 * Date:     2019/3/10 13:40
 * History:
 * <version> 1.0
 * @author lin
 */
public class Adaptee {
    public void sampleOperation1(){
        System.out.println("this is original method!");
    }
}
