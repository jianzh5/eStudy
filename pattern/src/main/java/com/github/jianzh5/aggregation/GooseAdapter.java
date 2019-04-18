package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>GooseAdapter</code>
 * </p>
 * Description:
 * 适配器模式，将Goose适配成Duck
 * @author jam
 * @date 2019/4/16下午7:23
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable ;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
