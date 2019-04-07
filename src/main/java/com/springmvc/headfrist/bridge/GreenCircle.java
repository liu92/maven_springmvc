package com.springmvc.headfrist.bridge;

/**
 * ClassName: GreenCircle
 * Description: 绿色圆圈
 * Author:   lin
 * Date:     2019/3/10 19:22
 * History:
 * <version> 1.0
 */
public class GreenCircle implements Draw {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
