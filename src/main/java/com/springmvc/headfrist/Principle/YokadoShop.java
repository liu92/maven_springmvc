package com.springmvc.headfrist.Principle;

/**
 * @ClassName: YokadoShop
 * @Description: 伊藤洋华堂
 * @Author: lin
 * @Date: 2019/9/4 18:05
 * History:
 * @<version> 1.0
 */
public class YokadoShop implements Shop{
    @Override
    public String sell(){
        return  "yokado.....shop";
    }
}
