package com.springmvc.headfrist.adaptermode;

/**
 * ClassName: Wapper
 * Description: 对象适配器，对象适配器只是不去继承Adaptee ,而是在持有Adaptee的实例，也就是引用
 * Date:     2019/3/10 13:54
 * History:
 * <version> 1.0
 * @author lin
 */
public class Wapper implements  Target{
    private  Adaptee adaptee;


    public  Wapper(Adaptee adaptee){
        super();
        this.adaptee=adaptee;
    }

    @Override
    public void sampleOperation1() {
       adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("this is the targetable method!");
    }
}
