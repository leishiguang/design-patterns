package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 餐厅1
 *
 * @author LeiShiGuang
 * Date  2018/10/22 21:58
 * @version v1.0
 */
public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        this.menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);

        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);

        addItem("Blueberry Pancakes",
                "Pancakes with fresh blueberries",
                true,
                3.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        //return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }
}
