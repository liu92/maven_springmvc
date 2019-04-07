package com.springmvc.headfrist.observerpattern;

/**
 * 测试
 * @author
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentC = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.6f);


    }
}
