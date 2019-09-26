package com.springmvc.headfrist.Principle;

/**
 *
 * @ClassName: Customer
 * @Description:
 * @Author: lin
 * @Date: 2019/9/4 18:02
 * History:
 * @<version> 1.0
 */
public class Customer {

    /**这种设计方式就是存在缺点，如果想换成其他的商场就需要修改代码，
     * 所以将商场设计成接口类，顾客类面向接口进行编程就可以了
     */
//    public void shopping(AuchanShop auchanShop){
//        System.out.println(auchanShop.sell());
//    }


    public void shopping(Shop shop){
        System.out.println(shop.sell());
    }
}
