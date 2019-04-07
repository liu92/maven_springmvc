package com.springmvc.headfrist.builderpattern;

/**
 * ClassName: ConcreteBuilder
 * Description: 具体的建造者: 也就是电脑装机人员
 * Date:     2019/3/10 12:18
 * History:
 * <version> 1.0
 *
 * @author lin
 */
public class ConcreteBuilder extends  Builder{

    Computer computer = new Computer();

    @Override
    public void buliderCup() {
      computer.add("组装CPU");
    }

    @Override
    public void buliderMainboard() {
        computer.add("组装主板");
    }

    @Override
    public void buliedrSsd() {
        computer.add("组装固态硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
