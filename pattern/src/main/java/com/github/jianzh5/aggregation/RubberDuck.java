package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>RubberDuck</code>
 * </p>
 * Description:
 *  橡皮鸭
 * @author jam
 * @date 2019/4/16下午7:15
 */
public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
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
