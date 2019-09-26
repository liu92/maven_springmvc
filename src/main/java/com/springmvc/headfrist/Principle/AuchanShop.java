package com.springmvc.headfrist.Principle;

/**
 * @ClassName: AuchanShop
 * @Description: 欧尚
 * @Author: lin
 * @Date: 2019/9/4 18:07
 * History:
 * @<version> 1.0
 */
public class AuchanShop implements Shop {
    @Override
    public String sell(){
        return "auchan.....shop";
    }
}
