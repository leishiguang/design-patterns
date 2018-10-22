package IteratorPattern;


import java.util.Iterator;

/**
 * 迭代器1
 *
 * @author LeiShiGuang
 * Date  2018/10/22 22:11
 * @version v1.0
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }
}
