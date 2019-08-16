package com.ray.iterator;

import java.util.Iterator;

/**
 * 空迭代器
 *
 * @author leishiguang
 * date  2018/10/26 21:58
 * @version v1.0
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
