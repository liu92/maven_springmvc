package com.springmvc.headfrist.facade;

/**
 * ClassName: Cpu
 * Description: Cup 实现类， 外观模式
 * Author:   lin
 * Date:     2019/3/10 18:22
 * History:
 * <version> 1.0
 */
public class Cpu {

    public void startup(){
        System.out.println("cpu startup!");
    }

    public void shutdown(){
        System.out.println("cpu shutdown!");
    }
}
