package com.github.jianzh5.aggregation;


/**
 * <p>
 * <code>QuackObservable</code>
 * </p>
 * Description:
 *  观察者模式
 *   Observable就是被观察的对象。Observable需要注册和通知观察者的方法。
 * @author jam
 * @date 2019/4/17下午7:08
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
