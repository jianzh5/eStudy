package com.github.jianzh5.aggregation;

/**
 * <p>
 * <code>AbstractDuckFactory</code>
 * </p>
 * Description:
 *  抽象工厂，他们的子类负责创建不同的家族
 * @author jam
 * @date 2019/4/17下午6:44
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
