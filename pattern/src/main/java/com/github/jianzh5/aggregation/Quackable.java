package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>Quackable</code>
 * </p>
 * Description:
 *  被观察者？主题
 * @author jam
 * @date 2019/4/16下午7:13
 */
public interface Quackable extends QuackObservable{
    public void quack();
}
