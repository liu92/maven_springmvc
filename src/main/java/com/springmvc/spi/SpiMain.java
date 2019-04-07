package com.springmvc.spi;

import java.util.ServiceLoader;

/**
 * ClassName: SpiMain
 * Description: 测试类
 * Author:   lin
 * Date:     2019/3/10 0:10
 * History:
 * <version> 1.0
 */
public class SpiMain {
    public static void main(String[] args) {
        ServiceLoader<SpiDemo> spiDemoServiceLoader = ServiceLoader.load(SpiDemo.class);
        for (SpiDemo spiService :spiDemoServiceLoader) {
            spiService.connection();
        }
    }
}
