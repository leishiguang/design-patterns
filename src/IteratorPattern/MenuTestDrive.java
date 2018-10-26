package IteratorPattern;

import java.util.ArrayList;

/**
 * 测试类
 *
 * @author LeiShiGuang
 * Date  2018/10/22 22:25
 * @version v1.0
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        ArrayList<Menu> menuArrayList = new ArrayList<>();
        menuArrayList.add(pancakeHouseMenu);
        menuArrayList.add(dinerMenu);
        menuArrayList.add(cafeMenu);
        Waitress waitress = new Waitress(menuArrayList);
        waitress.printMenu();
    }
}
