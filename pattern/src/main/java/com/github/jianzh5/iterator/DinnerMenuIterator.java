package com.github.jianzh5.iterator;
import java.util.Iterator;

/**
 * <p>
 * <code>DinnerMenuIterator</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/4/5下午7:13
 */
public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items) {
        this.items = items;
    }


    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }


    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public void remove(){
        if(position <= 0){
            throw new IllegalArgumentException("you can't remove an item until you've done at least one next()");
        }
        if(items[position - 1] ==null){
            for (int i = position - 1 ; i < items.length - 1 ; i++) {
                items[i] = items[i + 1];
            }
            items[items.length - 1] = null;
        }

    }

}
