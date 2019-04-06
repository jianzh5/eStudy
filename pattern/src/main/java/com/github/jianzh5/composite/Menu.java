package com.github.jianzh5.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>
 * <code>Menu</code>
 * </p>
 * Description:
 * 菜单组件
 *  菜单上既可以包含菜单也可以包含菜单项
 * @author jam
 * @date 2019/4/6下午7:57
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }


    @Override
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    /**
     * 菜单没有是否蔬菜属性，这里为了防止错误操作直接抛出异常
     * @return
     */
    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.println();
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("=====================");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator(){
        return new CompsiteIterator(menuComponents.iterator());
    }
}
