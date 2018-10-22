package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 迭代器2
 *
 * @author LeiShiGuang
 * Date  2018/10/22 22:15
 * @version v1.0
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }


    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
