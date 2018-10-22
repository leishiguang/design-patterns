package IteratorPattern;

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
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
