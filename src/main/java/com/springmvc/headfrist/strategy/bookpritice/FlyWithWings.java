package com.springmvc.headfrist.strategy.bookpritice;

/**
 * 实现飞 的类
 */
public class FlyWithWings implements  FlyBehavior {

    @Override
    public void fly() {
       System.out.print("I'm flying !! ");
    }
}
