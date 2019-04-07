package com.springmvc.headfrist.strategy.bookpritice;

/**
 * 绿头鸭使用Quack类处理呱呱叫
 */
public class MallardDuck extends Duck {

    public  MallardDuck(){
        // 这里实例化变量的做法不够弹性，但是quackBehavior是 一个接口类型
        // 我们能够在运行时，通过多态的魔力动态的给他指出不同的 QuackBehavior 实现类
       quackBehavior = new Quack();
       flyBehavior =  new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.print("I'm a real Mallard duck");
    }


}
