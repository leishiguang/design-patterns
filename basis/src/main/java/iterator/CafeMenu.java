package iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @author leishiguang
 * date  2018/10/26 20:58
 * @version v1.0
 */
public class CafeMenu implements Menu {

    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun, lettuce",
                true, 3.99);
        addItem("Soup of the day",
                "A cup of the sou of the day",
                false, 3.69);
        addItem("Burrito",
                "A large buito, with whole pinto beans",
                true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
