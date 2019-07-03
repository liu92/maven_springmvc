package com.springmvc.methodhandle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * @ClassName: Test
 * @Description:
 * @Author: lin
 * @Date: 2019/7/3 23:19
 * History:
 * @<version> 1.0
 */
public class Test {
    class  GrandFather{
        void  thinking(){
            System.out.println("i am grandfather");
        }
    }

    class Father extends GrandFather{
        @Override
        void thinking(){
            System.out.println("i am father");
        }
    }

    class Son extends  Father{
        @Override
        void thinking(){
            try {
                MethodType mt = MethodType.methodType(void.class);
                MethodHandle mh = lookup().findSpecial(GrandFather.class,"thinking", mt, getClass());
                mh.invoke(this);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        (new Test().new Son()).thinking();
    }
}
