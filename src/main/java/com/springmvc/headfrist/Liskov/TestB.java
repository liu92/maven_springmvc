package com.springmvc.headfrist.Liskov;

/**
 * 测试类B
 * @ClassName: TestB
 * @Description:
 * @Author: lin
 * @Date: 2018/6/4 16:18
 * History:
 * @<version> 1.0
 */
public class TestB extends TestA{

    @Override
    public int to(int a, int b){
        return  a-b;
    }


    public int fo(int a, int b){
      return  to(a,b)+20;
    }
}
