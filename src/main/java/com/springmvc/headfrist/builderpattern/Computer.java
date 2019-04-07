package com.springmvc.headfrist.builderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Product
 * Description: 具体产品类
 * Date:     2019/3/10 12:00
 * History:
 * <version> 1.0
 * @author lin
 */
public class Computer {

    private List<String> strings = new ArrayList<>();

    public void add(String part){
        strings.add(part);
    }

    public void show(){
        for (int i = 0; i < strings.size(); i++) {
            System.out.println("组件"+strings.get(i)+"装好了");
        }
        System.out.println("电脑组装完成，请验收");
    }
}
