package com.github.jianzh5.iterator;

import java.util.HashMap;
import java.util.Iterator;

/**
 * <p>
 * <code>CofeMenu</code>
 * </p>
 * Description:
 * HashMap迭代器
 * @author jam
 * @date 2019/4/5下午10:14
 */
public class CofeMenu implements Menu {
    HashMap hashMap = new HashMap();

    public CofeMenu() {
        addItem("Veggire","bun,lettuce",true,1.99);
        addItem("Soup","a cup of the day",true,4.89);
        addItem("Burrito","salsa,quacamole",true,5.39);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        hashMap.put(name,menuItem);
    }

    @Override
    public Iterator createIterator() {
        return hashMap.values().iterator();
    }
}
