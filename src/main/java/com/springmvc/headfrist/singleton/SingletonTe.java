package com.springmvc.headfrist.singleton;



public class SingletonTe {

	private static Singleton instance=null;
	
	private SingletonTe(){}
	
	 /* 此处使用一个内部类来维护单例 */  
    private static class SingletonFactory {  
        private static SingletonTe instance = new SingletonTe();  
    }  
  
     /* 获取实例 */  
//    static int p=0;
    public static SingletonTe getInstance() {  
             
        return SingletonFactory.instance;  
    }
    
  /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
   */  
   public Object readResolve() {  
       return instance;  
   }  
}
