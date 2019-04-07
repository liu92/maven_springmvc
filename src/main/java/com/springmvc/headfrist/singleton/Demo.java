package com.springmvc.headfrist.singleton;

public class Demo {
   private static  boolean flag=false;
   
   private Demo(){
   }
   
   private static class SingletonHolder{
	   private static final Demo  INSTANCE=new Demo();
   }
   
   public static Demo getInstance(){
	   return SingletonHolder.INSTANCE;
   }
   
   public void doSomething(){
	   
   }
}
