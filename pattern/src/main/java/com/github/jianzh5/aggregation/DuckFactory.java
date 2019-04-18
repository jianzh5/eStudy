package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>DuckFactory</code>
 * </p>
 * Description:
 * 具体工厂，创建真正的鸭子类型
 * @author jam
 * @date 2019/4/17下午6:47
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
