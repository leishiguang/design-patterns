package IteratorPattern;

import java.awt.*;
import java.util.Iterator;

/**
 * 女服务员
 *
 * @author LeiShiGuang
 * Date  2018/10/22 22:19
 * @version v1.0
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        System.out.println("MENU\n---------\nBREAKFAST");
        printMenu(pancakHouseMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ",");
            System.out.println(menuItem.getPrive() + "--");
            System.out.println(menuItem.getDescription() + ",");
        }
    }
}
