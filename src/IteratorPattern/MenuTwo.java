package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author LeiShiGuang
 * Date  2018/10/26 21:29
 * @version v1.0
 */
public class MenuTwo extends MenuComponent {
    ArrayList<MenuComponent> menuComponets = new ArrayList<>();
    String name;
    String description;

    public MenuTwo(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponets.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponets.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponets.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------");

        Iterator iterator = menuComponets.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponets.iterator());
    }
}
