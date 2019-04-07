package com.springmvc.springbean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtils implements ApplicationContextAware {

	private static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringUtils.context = applicationContext;
	}

	public static Object getBean(String name) {
		if (null == name) {
			throw new RuntimeException("bean is required");
		}
		return context == null ? null : context.getBean(name);
	}

	/**
	 * 根据
	 * 
	 * @Title:getClass
	 * @Description:TODO
	 * @param c
	 * @return
	 * @author liuwanlin
	 * @date 2017年7月21日下午2:38:15
	 */
	public static <T> T getClass(Class<?> c) {
		return (T) context.getBean(c);
	}
}
