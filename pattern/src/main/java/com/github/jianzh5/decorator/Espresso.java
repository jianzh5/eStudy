package com.github.jianzh5.decorator;

/**
 * <p>
 * <code>Espresso</code>
 * </p>
 * Description:
 * 具体需要装饰的子类
 * @author jam
 * @date 2019/3/29下午10:39
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
