package pattern.behavioral.iterator;

import java.util.Iterator;

/**
 * 餐厅2
 *
 * @author leishiguang
 * date  2018/10/22 22:03
 * @version v1.0
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT",
                "Fakin Bacon with lettuce",
                true,
                2.99);

        addItem("BLT",
                "Bacon with lettuce tomato on whole wheat",
                false,
                2.99);

        addItem("Hotdog",
                "A hot dog, with saurkraut",
                false,
                3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
