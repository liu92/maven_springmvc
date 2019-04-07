package com.springmvc.headfrist.strategy.bookpritice;

/**
 * 模型鸭
 */
public class ModelDuck extends  Duck {

    //一开始模型鸭是不会飞的
    public  ModelDuck(){
        flyBehavior  = new FlyNoWay();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.print("I'm a model duck");
    }
}
