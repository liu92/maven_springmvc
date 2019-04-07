package com.springmvc.headfrist.adaptermode.interfacepattern;

/**
 * ClassName: SourceSub1
 * Description: 实现抽象类
 * Author:   lin
 * Date:     2019/3/10 15:13
 * History:
 * <version> 1.0
 */
public class SourceSub1 extends Wrapper2 {

    @Override
    public void method1(){
        System.out.println("the sourceable interface's first Sub1!");
    }
}
