package iterator;

/**
 * 测试类
 *
 * @author leishiguang
 * date  2018/10/22 22:25
 * @version v1.0
 */
public class MenuTestDriveTwo {

    public static void main(String[] args) {
        MenuComponent pacakeHouseMenu = new MenuTwo("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new MenuTwo("DINER MENU", "Lunch");
        MenuComponent cafMenu = new MenuTwo("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new MenuTwo("DESSERT MENU", "Dessert of course!");
        MenuComponent allMenus = new MenuTwo("ALL MENUS", "All menus combined");

        allMenus.add(pacakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafMenu);

        dinerMenu.add(new MenuItem("Burrito",
                "A large buito, with whole pinto beans",
                true, 4.29));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Vegetarian BLT",
                "Fakin Bacon with lettuce",
                true,
                2.99));

        WaitressTwo waitressTwo = new WaitressTwo(allMenus);
        waitressTwo.printMenu();
        waitressTwo.printVegetarianMenu();
    }
}
