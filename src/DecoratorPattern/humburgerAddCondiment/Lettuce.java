package DecoratorPattern.humburgerAddCondiment;

/**
 * 生菜
 *
 * @author LeiShiGuang
 * Date  2018/10/2 10:04
 * @version v1.0
 */
public class Lettuce extends Condiment {
    Humburger humburger;

    public Lettuce(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + " 加生菜";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice() + 1.5;
    }
}

