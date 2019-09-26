package com.springmvc.headfrist.Principle;

/**
 * @ClassName: DemoCustomer
 * @Description:
 * @Author: lin
 * @Date: 2019/9/4 22:01
 * History:
 * @<version> 1.0
 */
public class DemoCustomer {
    public static void main(String[] args) {
        Customer c = new Customer();
        System.out.println("顾客去以下商店购买商品：");
        c.shopping(new AuchanShop());
        c.shopping(new YokadoShop());
    }
}
