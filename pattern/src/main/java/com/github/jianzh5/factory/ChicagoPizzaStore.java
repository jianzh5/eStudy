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
        Pizza pizza;
        ChicagoIngredientFactory chicagoIngredientFactory = new ChicagoIngredientFactory();
        if("cheese".equals(type)){
            pizza = new ChicagoStyleCheesePizza(chicagoIngredientFactory);
            pizza.setName("Chicago Pizza");
            return pizza;
        }
        return null;
    }
}
