package com.github.jianzh5.factory;

/**
 * <p>
 * <code>PizzaTestDrive</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/30下午11:31
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() +"\n");


        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Jam ordered a " + pizza.getName() +"\n");
    }
}
