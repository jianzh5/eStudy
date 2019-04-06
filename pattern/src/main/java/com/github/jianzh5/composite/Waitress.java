package com.github.jianzh5.composite;

import java.util.Iterator;

/**
 * <p>
 * <code>Waitress</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/6下午8:04
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }


    public void printVegetarianMenu(){
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n---");

        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if(menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            }catch (UnsupportedOperationException e){

            }

        }
    }
}
