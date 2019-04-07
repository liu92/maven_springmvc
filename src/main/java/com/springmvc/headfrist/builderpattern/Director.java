package com.springmvc.headfrist.builderpattern;

/**
 * ClassName: Director
 * Description: 指挥者，用于构建一个使用builder接口的对象。
 * 主要作用：1隔离了客户与对象的生成过程，2负责产品的生成过程
 * Author:   lin
 * Date:     2019/3/10 11:57
 * History:
 * <version> 1.0
 */
public class Director {

    public  void Construct(Builder builder){
        builder.buliderCup();
        builder.buliderMainboard();
        builder.buliedrSsd();
    }
}
