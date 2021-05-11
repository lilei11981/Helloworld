package com.company.zoo.abc.demo31;

/**
 * @author lilei
 * @date 2020-09-06 20:40
 * @apiNote
 */

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("温度:" + temperature + " 湿度:" + humidity);
    }
}
