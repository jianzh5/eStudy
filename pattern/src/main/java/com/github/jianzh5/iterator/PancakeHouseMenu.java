package com.github.jianzh5.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>
 * <code>PancakeHouseMenu</code>
 * </p>
 * Description:
 * ArrayList迭代器
 * @author jam
 * @date 2019/4/5下午6:51
 */
public class PancakeHouseMenu implements Menu{
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B Pancake BreakFast","Pancakes with scrambled eggs, and toast",true,2.99);
        addItem("Regular Pancake BreakFast","Pancakes with fried eggs,sausage",false,2.99);
        addItem("Blueberry Pancakes","Pancakes made with fresh blueberries",true,3.49);
        addItem("Waffles","Waffles, with your choices of blueberries or strawberries",true,3.59);


    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}
