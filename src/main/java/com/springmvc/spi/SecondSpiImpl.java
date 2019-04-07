package com.springmvc.spi;

/**
 * ClassName: SecondSpiImpl
 * Description: 第二个实现类
 * Date:     2019/3/10 0:09
 * History:
 * <version> 1.0
 * @author lin
 */
public class SecondSpiImpl implements SpiDemo {
    @Override
    public void connection() {
        System.out.println("我是第二个SPI实现类");
    }
}
