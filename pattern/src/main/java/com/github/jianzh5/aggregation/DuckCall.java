package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>DuckCall</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/16下午7:15
 */
public class DuckCall implements Quackable {
    Observable observable ;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
       notifyObservers();
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
