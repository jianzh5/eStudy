package com.github.jianzh5.observer;

/**
 * <p>
 * <code>Observer</code>
 * </p>
 * Description:
 * 观察者必须实现一个统一接口
 * @author jam
 * @date 2019/3/29下午3:45
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
