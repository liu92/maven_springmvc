package com.springmvc.headfrist.strategy.bookpritice;

/**
 * 测试类
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck malled = new MallardDuck();
        // 这里调用MallardDuck 继承来的 performQuack()方法
        // 进而委托给 该对象的QuackBehavior对象处理（也就是说，调用继承来的
        // quackBehavior引用对象的quack()方法）.
        // 至于 performFly(),也是一样的道理

        malled.performQuack();
        malled.performFly();

        //第一次调用performFly 会被委托给FlyBehavior对象（也就是FlyNoWay实例）
        // 该对象是在模型鸭构造器中设置的

        Duck model = new ModelDuck();
        model.performFly();
        // 这里调用继承过来的setter方法，把火箭动力飞行的行为设定到模型鸭中去。、
        // 现在模型鸭有了火箭动力飞行的能力
        model.setFlyBehavior(new FlyRocketPowered());
        //如果成功了，就意味着模型鸭可以动态的改变他的飞行行为，
        //如果把行为的实现绑死在鸭子类中，可就无法做到这样
        model.performFly();
    }

}
