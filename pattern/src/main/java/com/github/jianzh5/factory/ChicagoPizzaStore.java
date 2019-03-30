package com.github.jianzh5.factory;

/**
 * <p>
 * <code>ChicagoPizzaStore</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/30下午11:30
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
