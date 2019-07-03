package com.springmvc.classloading;

/**
 * @ClassName: ConstClass
 * @Description: 测试被动加载类
 * 常量在编译阶段会存入调用类的常量池中，本质上并没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化
 * @Author: lin
 * @Date: 2019/6/29 9:04
 * History:
 * @<version> 1.0
 */
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD="hello world";

}
