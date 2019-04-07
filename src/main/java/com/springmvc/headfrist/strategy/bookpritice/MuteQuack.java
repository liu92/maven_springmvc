package com.springmvc.headfrist.strategy.bookpritice;

/**
 * 实现叫的类
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("<< Silence >> ");
    }
}
