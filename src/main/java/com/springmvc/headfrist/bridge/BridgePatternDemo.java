package com.springmvc.headfrist.bridge;

/**
 * ClassName: BridgePatternDemo
 * Description: 测试桥接模式
 * Author:   lin
 * Date:     2019/3/10 19:28
 * History:
 * <version> 1.0
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircl = new Circle(100,100,10,new RedCircle());
        Shape greenCricle = new Circle(100,100,10,new GreenCircle());
        redCircl.draw();
        greenCricle.draw();
    }
}
