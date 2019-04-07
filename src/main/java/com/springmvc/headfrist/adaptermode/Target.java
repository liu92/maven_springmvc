package com.springmvc.headfrist.adaptermode;

/**
 * ClassName: Target
 * Description: 目标角色
 * Author:   lin
 * Date:     2019/3/10 13:39
 * History:
 * <version> 1.0
 */
public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
     void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
     void sampleOperation2();
}
