package DecoratorPattern.humburgerAddCondiment;

/**
 * 鸡腿堡
 *
 * @author LeiShiGuang
 * Date  2018/10/2 10:02
 * @version v1.0
 */
public class ChickenBurger extends Humburger {
    public ChickenBurger() {
        name = "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
