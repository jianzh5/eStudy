package com.github.jianzh5.decorator;

/**
 * <p>
 * <code>Mocha</code>
 * </p>
 * Description:
 * 具体装饰类
 * @author jam
 * @date 2019/3/29下午10:42
 */
public class Mocha extends AbstractCondiment {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        //委派给装饰对象beverage
        return 0.20 + beverage.cost();
    }
}
