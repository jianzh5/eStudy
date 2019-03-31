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
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();

        if("cheese".equals(type)){
            pizza = new NYStyleCheesePizza(ingredientFactory);
            pizza.setName("NY Cheese Pizza");
            return pizza;
        }
        return null;
    }
}
