package com.springmvc.headfrist.factorymethod;

public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//如果工厂模式中的方法是静态则直接调用
		Sender factory =SendFactory.productMail(); 
		//这个是工厂模式里方法需要创建实例
		//SendFactory factory = new SendFactory();  
        //Sender sender = factory.productMail();  
		factory.send();  
	}

}
