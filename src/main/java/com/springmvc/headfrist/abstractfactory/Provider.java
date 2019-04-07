package com.springmvc.headfrist.abstractfactory;

import com.springmvc.headfrist.factorymethod.Sender;

/**
 * 测试抽象工厂
 * <p>Title:Provider</p>
 * @author liuwanlin
 * @date 2017年11月29日上午11:12:22
 */
public interface Provider {
  public Sender produce();
}
