package com.springmvc.headfrist.bridge.br;

/**
 * ClassName: MyBridge
 * Description:
 * Author:   lin
 * Date:     2019/3/10 21:12
 * History:
 * <version> 1.0
 */
public class MyBridge extends Bridge {
    @Override
    public void method(){
       getSource().method();
    }
}
