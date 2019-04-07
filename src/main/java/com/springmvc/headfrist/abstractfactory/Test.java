package com.springmvc.headfrist.abstractfactory;


import com.springmvc.headfrist.factorymethod.Sender;

/**
 * 测试 抽象工厂
 * <p>Title:Test</p>
 * @author liuwanlin
 * @date 2017年11月29日上午11:17:25
 */
public class Test {
 public static void main(String[] args) {
	 //实例化 工厂
	Provider provider = new SendMailFactory();
	// 调用工厂中方法
	Sender sender = provider.produce();
	// 
	sender.send();
 }
}
