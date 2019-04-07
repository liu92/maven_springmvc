package com.springmvc.headfrist.decorator;

/**
 * ClassName: Source
 * Description: 具体实现
 * Author:   lin
 * Date:     2019/3/10 17:07
 * History:
 * <version> 1.0
 */
public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
