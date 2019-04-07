package com.springmvc.headfrist.bridge;

/**
 * ClassName: Shape
 * Description:
 * Author:   lin
 * Date:     2019/3/10 19:23
 * History:
 * <version> 1.0
 */
public abstract class Shape {
    protected Draw draw1;
    protected Shape(Draw draw1){
        this.draw1 = draw1;
    }

    public abstract  void draw();
}
