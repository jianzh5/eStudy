package com.github.jianzh5.factory;

/**
 * <p>
 * <code>PizzaStore</code>
 * </p>
 * Description:
 * 工厂方法，负责生产pizza
 * @author jam
 * @date 2019/3/30下午11:18
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    /**
     * 实例化pizza的责任被移到一个方法中，此方法就如同一个工厂
     *  此描述大概就是工厂方法的由来
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
