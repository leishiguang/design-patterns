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
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }


    public void printMenu() {
        Iterator pancakHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU\n---------\nBREAKFAST");
        printMenu(pancakHouseMenuIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerMenuIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrive() + " -- ");
            System.out.println(menuItem.getDescription() + ",");
        }
    }
}
