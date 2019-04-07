package com.springmvc.headfrist.factorymethod;
/**
 * 实现类
 * @author lenovo
 *
 */
public class SmsSender implements Sender {

	@Override
	public void send() {
		 System.out.println("this is sms sender!");  
		
	}

}
