package com.springmvc.headfrist.observerpattern;

/**
 * 这里是 “观察者接口”
 */
public interface Observert {

    /**
     * 观察者更新方法
     * 当气象观测值改变时，主题会把这些状态值当作方法的参数，传递给观察者。
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
