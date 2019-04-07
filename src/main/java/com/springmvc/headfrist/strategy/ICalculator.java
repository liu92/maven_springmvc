package com.springmvc.headfrist.strategy;

/**
 * 策略模式 ，策略模式定义了一系列的算法，并将每个算法封装起来，使他们可以替换，
 * 且算法的变化不会影响到使用算法的客户。
 * 需要设计一个接口，为一系列实现类提供统一的方法，多个实现类实现该接口
 * <p>Title:ICalculator</p>
 * @author liuwanlin
 * @date 2017年12月21日下午10:07:40
 */
public interface ICalculator {

	/**
	 * 定义统一接口
	 * @Title:
	 * @Description:定义统一接口
	 * @param exp
	 * @return  
	 * @author liuwanlin
	 * @date 2017年12月21日下午10:10:17
	 */
	 int calculator(String exp);
	
}
