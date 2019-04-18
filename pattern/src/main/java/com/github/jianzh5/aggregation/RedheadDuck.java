package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>RedheadDuck</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/16下午7:14
 */
public class RedheadDuck implements Quackable {
    Observable observable ;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
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
