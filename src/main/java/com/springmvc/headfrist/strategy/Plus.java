package com.springmvc.headfrist.strategy;

/**
 * 实现类型
 * <p>Title:Plus</p>
 * @author liuwanlin
 * @date 2017年12月21日下午10:13:22
 */
public class Plus extends AbstractCalculator implements ICalculator {

	/**
	 * 相加
	 * @Title:
	 * @Description:相加
	 * @param exp
	 * @return  
	 * @author liuwanlin
	 * @date 2017年12月21日下午10:15:05
	 */
	@Override
	public int calculator(String exp) {
		int[]  arrayInt =split(exp, "\\+");
		return arrayInt[0]+arrayInt[1];
	}

}
