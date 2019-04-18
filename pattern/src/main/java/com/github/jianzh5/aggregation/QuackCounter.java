package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>QuackCounter</code>
 * </p>
 * Description:
 *  装饰者模式，让原接口可以实现更多额外的动作
 * @author jam
 * @date 2019/4/16下午7:28
 */
public class QuackCounter implements Quackable {
    Observable observable;
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();//具体的实现委派给实际对象
        numberOfQuacks++;
        notifyObservers();
    }

    public static int getQuacks(){
        return numberOfQuacks;
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
