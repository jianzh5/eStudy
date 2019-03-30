package com.github.jianzh5.factory;

import java.util.ArrayList;

/**
 * <p>
 * <code>Pizza</code>
 * </p>
 * Description:
 * 具体需要生产的产品
 * @author jam
 * @date 2019/3/30下午11:12
 */
public abstract class Pizza {
    //每个pizza都需要名称、面团类型，酱料类型还有佐料
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Prepareing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }


    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("boxing the pizza");
    }

    public String getName(){
        return name;
    }

}
