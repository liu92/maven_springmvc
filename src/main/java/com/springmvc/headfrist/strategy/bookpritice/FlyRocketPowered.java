package com.springmvc.headfrist.strategy.bookpritice;

/**
 * 火箭飞行行为
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.print("I'm flying with a rocket");
    }
}
