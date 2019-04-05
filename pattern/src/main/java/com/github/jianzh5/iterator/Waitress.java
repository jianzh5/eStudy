package com.github.jianzh5.iterator;
import java.util.Iterator;

/**
 * <p>
 * <code>Waitress</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/5下午7:18
 */
public class Waitress {
    Menu dinnerMenu;

    Menu pancakeHouseMenu;

    Menu cofeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cofeMenu) {
        this.dinnerMenu = dinnerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cofeMenu = cofeMenu;
    }

    public void printMenu(){
        Iterator iterator = dinnerMenu.createIterator();
        System.out.println("--------------DINNER----------");
        printMenu(iterator);

        System.out.println();
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        System.out.println("------------BREAKEFAST-----------");
        printMenu(pancakeHouseMenuIterator);


        System.out.println();
        Iterator cofeIterator = cofeMenu.createIterator();
        System.out.println("------------COFE-----------");
        printMenu(cofeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName()+", ");
            System.out.println(item.getPrice()+", --");
            System.out.println(item.getDescription());
            System.out.println("=========");
        }
    }
}
