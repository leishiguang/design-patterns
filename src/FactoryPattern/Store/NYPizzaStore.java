package FactoryPattern.Store;

import FactoryPattern.Pizza.*;

/**
 * 实现了工厂方法，以便制造商品
 *
 * @author LeiShiGuang
 * Date  2018/8/8 20:47
 * @version v1.0
 */
public class NYPizzaStore extends PizzaStore {

    /* 实现了工厂方法，以便制造商品 */
    /*@Override
    Pizza createPizza(String type) {

        Pizza pizza = null;
        if (PizzaStyleEnum.PizzaStyle.Cheese.value.equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if (PizzaStyleEnum.PizzaStyle.Clam.value.equals(type)) {
            pizza = new NYStyleClamPizza();
        } else if (PizzaStyleEnum.PizzaStyle.Veggle.value.equals(type)) {
            pizza = new NYStyleVegglePizza();
        }
        if (pizza == null) {
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }*/

    @Override
    Pizza createPizza(PizzaStyleEnum.PizzaStyle type) {
        Pizza pizza = null;
        switch (type) {
            case Cheese:
                pizza = new NYStyleCheesePizza();
                break;
            case Clam:
                pizza = new NYStyleClamPizza();
                break;
            case Veggle:
                pizza = new NYStyleVegglePizza();
        }
        return pizza;
    }
}
