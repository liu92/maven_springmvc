package com.springmvc.headfrist.singleton;

import java.io.Serializable;

/**
 * 使用双重校验锁方式实现单例
 * 测试 序列化对一个单例的破坏
 * <p>Title:SingletonSerializable</p>
 * @author liuwanlin
 * @date 2017年11月29日上午11:45:02
 */
public class SingletonSerializable implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8607398639911248517L;
	
	
	private volatile static SingletonSerializable singletonSerializable;
	
	private SingletonSerializable(){
		
	}

	public static SingletonSerializable getSingletonSerializable(){
		if(singletonSerializable==null){
			synchronized (SingletonSerializable.class) {
				if(singletonSerializable == null){
					singletonSerializable = new SingletonSerializable();
				}
			}
		}
		return singletonSerializable;
	}
	
	private Object readResolve() {
		return singletonSerializable;
	}
}
