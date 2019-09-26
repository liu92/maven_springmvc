package com.springmvc.headfrist.Segregation;

/**
 * @ClassName: Demo
 * @Description:
 * @Author: lin
 * @Date: 2019/9/5 10:27
 * History:
 * @<version> 1.0
 */
public class Demo {
    public static void main(String[] args) {
        DemoB  d = new DemoB();
        d.to1(new DemoA());
        d.to4(new DemoA());
        d.to5(new DemoA());

    }
}
