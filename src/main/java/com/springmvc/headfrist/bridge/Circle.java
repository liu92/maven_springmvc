package com.springmvc.headfrist.bridge;

/**
 * ClassName: Circle
 * Description:
 * Author:   lin
 * Date:     2019/3/10 19:25
 * History:
 * <version> 1.0
 */
public class Circle extends Shape {
    private int x,y,raduis;
    protected Circle(int x, int y,int raduis, Draw draw1) {
        super(draw1);
        this.x=x;
        this.y = y;
        this.raduis =raduis;
    }

    @Override
    public void draw() {
        draw1.drawCircle(raduis,x,y);
    }
}
