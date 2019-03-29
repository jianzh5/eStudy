package com.github.jianzh5.observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 * <p>
 * <code>WeatherData</code>
 * </p>
 * Description:
 * 使用内置的观察者对象
 * @author jam
 * @date 2019/3/29下午3:49
 */
public class WeatherData2 extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData2() {

    }


    /**
     * 当主题进行更新时
     */
    public void measurementsChanged(){
        //申明此状态进行了变更
        setChanged();
        //没有传送数据对象，采用"拉"模式
        //使用拉模式时需要对外提供getter方法获取数据
        notifyObservers();
    }


    /**
     * 模拟从外部获取数据更新主题
     * @author jianzhang11
     * @date 2019/3/29 下午4:03
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity ,float pressure){
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
