package com.springmvc.headfrist.observerpattern;

import java.util.ArrayList;

/**
 * 气象数据，这个类实现了Subject接口
 */
public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    /**
     * 观察者注册时，我们只需把他加到ArrayList的后面即可
     * @param o
     */
    @Override
    public void registerObserver(Observert o) {
        observers.add(o);
    }

    /**
     * 同样的当观察者想取消注册，我们把它从ArrayList中删除即可
     * @param o
     */
    @Override
    public void removeObserver(Observert o) {
       int i = observers.indexOf(o);
       if(i>0){
           observers.remove(o);
       }
    }

    /**
     * 我们把状态告诉每一个观察者，因为观察者都实现了update(),所以我们知道如何通知它们;
     */
    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size() ; i++) {
            Observert observert = (Observert) observers.get(i);
            observert.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChangde(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChangde();
    }
}

