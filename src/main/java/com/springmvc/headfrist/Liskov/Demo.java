package com.springmvc.headfrist.Liskov;

/**
 * @ClassName: Client
 * @Description:
 * @Author: lin
 * @Date: 2018/6/4 16:22
 * History:
 * @<version> 1.0
 */
public class Demo {
    public static void main(String[] args) {
//        TestA a = new TestA();
//        System.out.println("10+50="+ a.to(10,50));
//        System.out.println("10+20="+ a.to(10, 20));

        TestB b = new TestB();
        System.out.println("50-20="+b.to(100,20));
        System.out.println("60-30="+b.to(100,50));
        System.out.println("10+50+20="+b.to(100,50));
    }
}
