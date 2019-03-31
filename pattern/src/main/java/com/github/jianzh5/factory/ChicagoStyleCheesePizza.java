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
public class ChicagoStyleCheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.ingredientFactory = pizzaIngredientFactory;
    }

    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void prepare() {
        dough = ingredientFactory.cretateDough();
    }

    @Override
    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}
