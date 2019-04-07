package com.springmvc.headfrist.strategy.bookpritice;

/**
 * 这个是给 不会飞的鸭子使用
 */
public class FlyNoWay implements  FlyBehavior{
    @Override
    public void fly() {
        System.out.print("I can't flying !! ");
    }
}
