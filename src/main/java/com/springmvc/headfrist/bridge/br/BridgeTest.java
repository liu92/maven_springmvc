package com.springmvc.headfrist.bridge.br;


/**
 * ClassName: BridgeTest
 * Description:
 * Author:   lin
 * Date:     2019/3/10 21:13
 * History:
 * <version> 1.0
 */
public class BridgeTest {
    private Bridge bridge;

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        SourDemo source1 = new SourSub();
        bridge.setSource(source1);
        bridge.method();

        /*调用第二个对象*/
        SourDemo source2 = new SourSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
