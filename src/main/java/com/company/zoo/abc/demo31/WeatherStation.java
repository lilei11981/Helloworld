package com.company.zoo.abc.demo31;

/**
 * @author lilei
 * @date 2020-09-06 20:53
 * @apiNote
 */

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(82, 70, 29);
    }
}
