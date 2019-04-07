package com.springmvc.headfrist.facade;

/**
 * ClassName: FacadeDemo
 * Description: 外观模式测试
 * Author:   lin
 * Date:     2019/3/10 18:28
 * History:
 * <version> 1.0
 */
public class FacadeDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
