package com.github.jianzh5.aggregation;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>
 * <code>Flock</code>
 * </p>
 * Description:
 *  组合模式允许我们像对待单个对象一样对待对象集合
 *     组合需要和叶子节点一样实现相同的接口
 * @author jam
 * @date 2019/4/17下午6:55
 */
public class Flock implements Quackable {
    Observable observable;

    ArrayList quackers = new ArrayList();


    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker){
        quackers.add(quacker);
    }


    @Override
    public void quack() {
        Iterator iterable = quackers.iterator();
        while (iterable.hasNext()){
            Quackable quacker  = (Quackable) iterable.next();
            quacker.quack();
            notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
