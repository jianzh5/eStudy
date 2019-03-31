package com.github.jianzh5.factory;

/**
 * <p>
 * <code>NYIngredientFactory</code>
 * </p>
 * Description:
 * 原料工厂实现类
 * @author jam
 * @date 2019/3/31下午12:00
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough cretateDough() {
        return new ChicagoDough("chicago","blue");
    }
}
