package com.springmvc.headfrist.strategy.bookpritice;

/**
 * 实现叫的 类
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("Squeak ");
    }
}
