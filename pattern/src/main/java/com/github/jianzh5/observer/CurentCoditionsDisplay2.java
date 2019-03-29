package com.github.jianzh5.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * <p>
 * <code>CurentCoditionsDisplay</code>
 * </p>
 * Description:
 * 布告板观察者
 * @author jam
 * @date 2019/3/29下午4:04
 */
public class CurentCoditionsDisplay2 implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    Observable observable;

    public CurentCoditionsDisplay2(Observable observable) {
        this.observable = observable;
        //注册自己
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current coditions:" + temperature + "F degress and " + humidity +"% humidity") ;
    }


    @Override
    public void update(Observable o, Object arg) {
        //需要使用instanceof 申明这是你需要的对象
        if(o instanceof WeatherData2){
            WeatherData2 weatherData2 = (WeatherData2) o;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }
}
