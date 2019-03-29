package com.github.jianzh5.observer;

import java.util.ArrayList;

/**
 * <p>
 * <code>WeatherData</code>
 * </p>
 * Description:
 * 让WeatherData对象实现主题
 * @author jam
 * @date 2019/3/29下午3:49
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if( i > 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        //轮询通知所有观察者
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当主题进行更新时
     */
    public void measurementsChanged(){
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
}
