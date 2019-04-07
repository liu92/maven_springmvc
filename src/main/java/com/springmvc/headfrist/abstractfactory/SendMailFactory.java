package com.springmvc.headfrist.abstractfactory;


import com.springmvc.headfrist.factorymethod.Sender;
import com.springmvc.headfrist.factorymethod.SmsSender;

/**
 * 抽象 工厂类
 * <p>Title:SendMailFactory</p>
 * @author liuwanlin
 * @date 2017年11月29日上午11:10:45
 */
public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
