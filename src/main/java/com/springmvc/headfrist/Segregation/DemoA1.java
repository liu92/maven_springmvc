package com.springmvc.headfrist.Segregation;

/**
 * @ClassName: DemoA1
 * @Description:
 * @Author: lin
 * @Date: 2019/9/5 10:36
 * History:
 * @<version> 1.0
 */
public class DemoA1 implements DemoInterFace1,DemoInterFace3 {
    @Override
    public void method1() {
        System.out.println("实现接口demoInterface的1方法");
    }

    @Override
    public void method4() {
        System.out.println("实现接口demoInterface的4方法");
    }

    @Override
    public void method5() {
        System.out.println("实现接口demoInterface的5方法");
    }
}
