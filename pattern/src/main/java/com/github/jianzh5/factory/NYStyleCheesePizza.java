package com.github.jianzh5.factory;

/**
 * <p>
 * <code>NYStyleCheesePizza</code>
 * </p>
 * Description:
 * 不同类型的pizza
 * @author jam
 * @date 2019/3/30下午11:24
 */
public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        sauce = "Marinare Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    void prepare() {
        dough = pizzaIngredientFactory.cretateDough();
    }
}
