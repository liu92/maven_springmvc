package com.springmvc.headfrist.adaptermode;

/**
 * ClassName: WapperTest
 * Description: 测试对象适配器
 * Date:     2019/3/10 13:59
 * History:
 * <version> 1.0
 * @author lin
 */
public class WapperTest {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Wapper(adaptee);
        target.sampleOperation1();
        target.sampleOperation2();
    }
}
