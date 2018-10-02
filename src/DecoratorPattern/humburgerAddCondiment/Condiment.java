package DecoratorPattern.humburgerAddCondiment;

/**
 * 配料的基类
 *
 * @author LeiShiGuang
 * Date  2018/10/2 10:03
 * @version v1.0
 */
public abstract class Condiment extends Humburger {

    @Override
    public abstract String getName();

}