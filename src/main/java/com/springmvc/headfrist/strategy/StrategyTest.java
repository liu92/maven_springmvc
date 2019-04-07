package com.springmvc.headfrist.strategy;

/**
 * 测试策略模式
 * <p>Title:StrategyTest</p>
 * @author liuwanlin
 * @date 2017年12月21日下午10:18:38
 */
public class StrategyTest {
	public static void main(String[] args) {
		String exp="2+8";
		ICalculator calculator =new Plus();
		int result=calculator.calculator(exp);
		System.out.println(result);
	}
	
}
