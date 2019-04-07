package com.springmvc.contextloader;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * spring mvc 容器加载过程
 * spring容器加载bean完成后进行初始化
 * <p>
 * Title:ContextLoader
 * </p>
 * 
 * @author liuwanlin
 * @date 2017年11月1日上午11:46:26
 */
public class ContextLoaderDemo implements ApplicationListener<ContextRefreshedEvent>{

	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(event.getApplicationContext().getParent()==null){
			Init.init();
		}
	}

}
