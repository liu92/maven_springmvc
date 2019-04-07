package com.springmvc.headfrist.builderpattern;

/**
 * ClassName: BulidPartternDemo
 * Description: 测试类
 * Date:     2019/3/10 12:23
 * History:
 * <version> 1.0
 * @author lin
 */
public class BulidPartternDemo {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();

        director.Construct(builder);

        Computer computer = builder.getComputer();
        computer.show();
    }
}
