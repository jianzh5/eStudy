package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>CountingDuckFactory</code>
 * </p>
 * Description:
 *  具体工厂，负责创建装饰类的鸭子
 * @author jam
 * @date 2019/4/17下午6:48
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
