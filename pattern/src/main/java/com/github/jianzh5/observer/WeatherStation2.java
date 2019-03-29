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
public class WeatherStation2 {
    public static void main(String[] args) {
        WeatherData2 weatherData = new WeatherData2();
        CurentCoditionsDisplay2 curentCoditionsDisplay = new CurentCoditionsDisplay2(weatherData);

        weatherData.setMeasurements(84,65,34);

    }
}
