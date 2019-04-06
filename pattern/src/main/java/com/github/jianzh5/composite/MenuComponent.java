package com.github.jianzh5.composite;


import java.util.Iterator;

/**
 * <p>
 * <code>MenuComponent</code>
 * </p>
 * Description:
 * 组合项与叶子项的父类
 * @author jam
 * @date 2019/4/6下午7:50
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }


    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
