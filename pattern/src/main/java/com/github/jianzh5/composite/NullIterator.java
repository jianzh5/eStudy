package com.github.jianzh5.composite;


import java.util.Iterator;

/**
 * <p>
 * <code>NullIterator</code>
 * </p>
 * Description:
 * 空迭代器
 * @author jam
 * @date 2019/4/6下午8:52
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
