package com.springmvc.headfrist.decorator;

/**
 * ClassName: DecoratorTest
 * Description: 装饰者测试类
 * Author:   lin
 * Date:     2019/3/10 17:10
 * History:
 * <version> 1.0
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable sourceable=new Source();
        Sourceable sourceable1 = new Decorator(sourceable);
        sourceable1.method();

    }
}
