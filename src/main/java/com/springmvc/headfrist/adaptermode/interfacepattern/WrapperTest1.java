package com.springmvc.headfrist.adaptermode.interfacepattern;

/**
 * ClassName: WrapperTest1
 * Description: 测试类
 * Author:   lin
 * Date:     2019/3/10 15:15
 * History:
 * <version> 1.0
 */
public class WrapperTest1 {
    public static void main(String[] args) {
        Sourceable sour1 = new SourceSub1();
        Sourceable sour2 = new SourceSub2();

        sour1.method1();
        sour1.method2();
        sour2.method1();
        sour2.method2();
    }
}
