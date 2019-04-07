package com.springmvc.proxy.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;


/**
     * cglib 使用
     * @ProjectName:    CglibProxy.java
     * @Package:        com.springmvc.proxy.cglibproxy
     * @ClassName:      CglibProxy
     * @Description:    java类作用描述
     * @Author:         作者姓名
     * @CreateDate:     2018/10/31 0031 18:29
     * @UpdateRemark:   The modified content
     * @Version:        1.0
     */
public class CglibProxy {
    public void SimpClass(){
        System.out.println("hello world");
    }

      public static void main(String[] args) {
          /**
           * cglib 中的类
           */
          Enhancer enhancer = new Enhancer();
          enhancer.setSuperclass(CglibProxy.class);

          // 首先实现一个MethodInterceptor，方法调用会被转发到该类的intercept()方法
          enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
              System.out.println("before method run...");
              Object object = methodProxy.invokeSuper(o,objects);
              return  object;
          });

//          enhancer.setCallback(new MethodInterceptor() {
//              @Override
//              public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                  System.out.println("before method run...");
//                  Object object = methodProxy.invokeSuper(o,objects);
//                  return  object;
//              }
//          });
      }
}
