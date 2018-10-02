package DecoratorPattern.humburgerAddCondiment;

/**
 * 辣椒类
 *
 * @author LeiShiGuang
 * Date  2018/10/2 10:04
 * @version v1.0
 */
public class Chilli extends Condiment {
    Humburger humburger;

    public Chilli(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName() + " 加辣椒";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice();  //辣椒是免费的哦	} }

    }
}