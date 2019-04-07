package com.springmvc.headfrist.adaptermode;

/**
 * ClassName: Adapter
 * Description: 适配器角色 Adapter 扩展了Adaptee,同时又实现了目标(Target)接口。
 * 由于Adaptee没有提供sampleOperation2()方法，而目标接口又要求这个方法，因此适配器角色Adapter实现了这个方法。
 * Date:     2019/3/10 13:40
 * History:
 * <version> 1.0
 * @author lin
 */
public class Adapter extends Adaptee implements Target{


    @Override
    public void sampleOperation2() {
        System.out.println("this is the target method!");
    }
}
