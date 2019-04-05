package com.github.jianzh5.iterator;
import java.util.Iterator;

/**
 * <p>
 * <code>DinnerMenu</code>
 * </p>
 * Description:
 * 数组迭代器
 * @author jam
 * @date 2019/4/5下午7:00
 */
public class DinnerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinnerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("BLT","tomato,lettuce",false,2.99);
        addItem("SOUP","soup with sugar",true,3.19);
        addItem("HoteDog","hotedog...e",false,4.39);
        addItem("VeL","vel,lettuce",true,5.19);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        if(numberOfItems > MAX_ITEMS){
            System.out.println("Sry,menu if full Can't add item to menu");
        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }

    }

    @Override
    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }
}
