package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>Quackologist</code>
 * </p>
 * Description:
 * 具体的观察者
 * @author jam
 * @date 2019/4/18下午7:24
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist:" + duck + "just quacked.");

    }
}
