package com.springmvc.controller;

import com.springmvc.service.ProxyByJdkDynamic;
import com.springmvc.service.SubjectService;
import com.springmvc.service.impl.SubjectServiceImpl;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@RestController
@RequestMapping("/user")
public class Hello {

	@Autowired
	private SubjectService subjectService;


	@RequestMapping(value = "/hello")
	public ModelAndView HelloWorld(Model model) {
		model.addAttribute("message", "Hello World!!!");
		return new ModelAndView("HelloWorld");
	}

	@RequestMapping(value = "proxyByJdk")
	public void proxyByJdk(){
     //是否是JDK动态代理
		System.out.println("是否是JDK动态代理=====isJdkDynamicProxy => " + AopUtils.isJdkDynamicProxy(subjectService));
     //是否是CGLIB代理
		System.out.println("是否是CGLIB代理====isCglibProxy => " + AopUtils.isCglibProxy(subjectService));
     //代理类的类型
		System.out.println("代理类的类型===proxyClass => " + subjectService.getClass());
     //代理类的父类的类型
		System.out.println("代理类的父类的类型=====parentClass => " + subjectService.getClass().getSuperclass());
    //代理类的父类实现的接口
		System.out.println("代理类的父类实现的接口=====parentClass's interfaces => " + Arrays.asList(subjectService.getClass().getSuperclass().getInterfaces()));
	//代理类实现的接口
		System.out.println("代理类实现的接口====proxyClass's interfaces => " + Arrays.asList(subjectService.getClass().getInterfaces()));
	//代理对象
		System.out.println("代理对象=====proxy => " + subjectService);
	//目标对象
		System.out.println("目标对象====target => " + AopProxyUtils.getSingletonTarget(subjectService));
	//代理对象和目标对象是不是同一个
		System.out.println("代理对象和目标对象是不是同一个======proxy == target => " + (subjectService == AopProxyUtils.getSingletonTarget(subjectService)));
	//目标类的类型
		System.out.println("目标类的类型====targetClass => " + AopProxyUtils.getSingletonTarget(subjectService).getClass());
	//目标类实现的接口
		System.out.println("目标类实现的接口===targetClass's interfaces => " + Arrays.asList(AopProxyUtils.getSingletonTarget(subjectService).getClass().getInterfaces()));

		System.out.println("----------------------------------------------------");

		//自己模拟的动态代理的测试
		SubjectService target = new SubjectServiceImpl();
		ProxyByJdkDynamic proxy = new ProxyByJdkDynamic(target);
		proxy.doNeedTx();
		System.out.println("-------");
		proxy.doNotneedTx();
		System.out.println("-------");
	}

}
