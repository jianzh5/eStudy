package com.github.jianzh5.composite;


import java.util.Iterator;
import java.util.Stack;

/**
 * <p>
 * <code>CompsiteIterator</code>
 * </p>
 * Description:
 * 菜单迭代器
 * @author jam
 * @date 2019/4/6下午8:39
 */
public class CompsiteIterator implements Iterator {
    Stack stack = new Stack();

    public CompsiteIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else {
            //从栈中弹出一个迭代器
            Iterator iterator = (Iterator) stack.peek();
            //如果没有next值，递归调用hasNext
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
