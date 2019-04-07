package com.springmvc.headfrist.adaptermode;

/**
 * ClassName: AdapterTest
 * Description: 测试类
 * Date:     2019/3/10 13:45
 * History:
 * <version> 1.0
 * @author lin
 */
public class AdapterTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.sampleOperation1();
        target.sampleOperation2();
    }
}
