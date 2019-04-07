package com.springmvc.headfrist.strategy;

/**
 * 实现类
 * <p>Title:Multiply</p>
 * @author liuwanlin
 * @date 2017年12月21日下午10:16:56
 */
public class Multiply extends AbstractCalculator implements ICalculator {

	/**
	 * 相乘
	 * @Title:
	 * @Description:相乘
	 * @param exp
	 * @return  
	 * @author liuwanlin
	 * @date 2017年12月21日下午10:17:17
	 */
	@Override
	public int calculator(String exp) {
		int[]  arrayInt=split(exp, "\\*");
		return arrayInt[0]*arrayInt[1];
	}

}
