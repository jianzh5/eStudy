package com.github.jianzh5.decorator;

/**
 * <p>
 * <code>AbstractCondiment</code>
 * </p>
 * Description:
 * 抽象装饰者
 * 装饰类需要继承装饰对象的基类，使得可以在任何时候将其替换
 * @author jam
 * @date 2019/3/29下午10:44
 */
public abstract class AbstractCondiment extends Beverage{

    @Override
    public abstract String getDescription();
}
