package com.springmvc.headfrist.decorator;

/**
 * ClassName: Decorator
 * Description: Decorator类是一个装饰类
 * Author:   lin
 * Date:     2019/3/10 17:08
 * History:
 * <version> 1.0
 */
public class Decorator implements Sourceable{

    private Sourceable sourceable;

    public  Decorator(Sourceable sourceable){
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator!");
        sourceable.method();
        System.out.println("after decorator!");
    }
}
