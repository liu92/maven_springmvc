package com.springmvc.headfrist.bridge;

/**
 * ClassName: RedCircle
 * Description: 红色的圆圈
 * Author:   lin
 * Date:     2019/3/10 19:21
 * History:
 * <version> 1.0
 */
public class RedCircle implements Draw{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
