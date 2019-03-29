package com.github.jianzh5.observer;

/**
 * <p>
 * <code>CurentCoditionsDisplay</code>
 * </p>
 * Description:
 * 布告板观察者
 * @author jam
 * @date 2019/3/29下午4:04
 */
public class CurentCoditionsDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurentCoditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //注册自己
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current coditions:" + temperature + "F degress and " + humidity +"% humidity") ;
    }

    /**
     * 当update被调用时，主动调用自己的逻辑实现
     * @param temp
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
