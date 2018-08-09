package FactoryPattern.Store;

import FactoryPattern.Pizza.*;

/**
 * 实现了工厂方法，只负责制造具体产品，也只有这个类知道如何制造产品。
 *
 * @author LeiShiGuang
 * Date  2018/8/9 8:41
 * @version v1.0
 */
public class ChicagoPizzaStore extends PizzaStore {

    /*  实现了工厂方法，以便制造商品 */
    /*@Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("veggle".equals(type)) {
            pizza = new ChicagoStyleVegglePizza();
        }
        if (pizza == null) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }*/

    @Override
    Pizza createPizza(PizzaStyleEnum.PizzaStyle type) {
        Pizza pizza = null;
        switch (type) {
            case Cheese:
                pizza = new ChicagoStyleCheesePizza();
                break;
            case Clam:
                pizza = new ChicagoStyleClamPizza();
                break;
            case Veggle:
                pizza = new ChicagoStyleVegglePizza();
        }
        return pizza;
    }
}
