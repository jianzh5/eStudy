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
    Dough dough;
    String sauce;
    ArrayList toppings = new ArrayList();


    /**
     * 从原料工厂制造原料
     */
    abstract void prepare();

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

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
