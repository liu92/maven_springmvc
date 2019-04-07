package com.springmvc.headfrist.observerpattern;

/**
 *  观察者模式
 *
 *  这里是“主题”（相当于是报纸出版社）
 *
 */
public interface Subject {

    /**
     * 注册
     * @param observert
     */
     void registerObserver(Observert observert);

    /**
     * 移除
     * @param observert
     */
     void removeObserver(Observert observert);


    /**
     * 当主题状态变化时，这个方法会被调用，已通知所有观察者。
     */
    void notifyObservers();
}
