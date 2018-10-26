package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 女服务员
 *
 * @author LeiShiGuang
 * Date  2018/10/22 22:19
 * @version v1.0
 */
class WaitressTwo {

    private MenuComponent allMenus;

    WaitressTwo(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    void printMenu() {
        allMenus.print();
    }

    void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException ignored) {
            }
        }
    }

}
