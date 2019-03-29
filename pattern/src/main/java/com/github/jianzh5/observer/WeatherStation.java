package com.github.jianzh5.observer;

/**
 * <p>
 * <code>WeatherStation</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/29下午4:13
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurentCoditionsDisplay curentCoditionsDisplay = new CurentCoditionsDisplay(weatherData);

        weatherData.setMeasurements(84,65,34);

    }
}
