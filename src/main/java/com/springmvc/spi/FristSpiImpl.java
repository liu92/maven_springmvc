package com.springmvc.spi;

/**
 * ClassName: FristSpiImpl
 * Description: 实现类
 * Author:   lin
 * Date:     2019/3/10 0:07
 * History:
 * <version> 1.0
 */
public class FristSpiImpl implements SpiDemo {
    @Override
    public void connection() {
        System.out.println("我是第一个SPI实现类");
    }
}
