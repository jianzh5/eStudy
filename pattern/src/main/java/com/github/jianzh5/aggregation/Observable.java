package com.github.jianzh5.aggregation;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>
 * <code>Observable</code>
 * </p>
 * Description:
 * 协助观察者的工具类
 * @author jam
 * @date 2019/4/18下午7:03
 */
public class Observable implements QuackObservable {
    ArrayList observers = new ArrayList();
    Quackable duck;

    public Observable(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
