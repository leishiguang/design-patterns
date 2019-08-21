package pattern.creational.factory.simplify.store;


import pattern.creational.factory.simplify.pizza.*;
import pattern.creational.factory.simplify.pizza.NyStyleVegglePizza;
import pattern.creational.factory.simplify.pizza.BasePizza;

/**
 * 实现了工厂方法，以便制造商品
 *
 * @author leishiguang
 * date  2018/8/8 20:47
 * @version v1.0
 */
public class NyPizzaStore extends BasePizzaStore {

    /* 实现了工厂方法，以便制造商品 */
    /*@Override
    BasePizza createPizza(String type) {

        BasePizza pizza = null;
        if (PizzaStyleEnum.PizzaStyle.Cheese.value.equals(type)) {
            pizza = new NyStyleCheesePizza();
        } else if (PizzaStyleEnum.PizzaStyle.Clam.value.equals(type)) {
            pizza = new NyStyleClamPizza();
        } else if (PizzaStyleEnum.PizzaStyle.Veggle.value.equals(type)) {
            pizza = new NyStyleVegglePizza();
        }
        if (pizza == null) {
            pizza = new NyStyleCheesePizza();
        }
        return pizza;
    }*/

    @Override
    BasePizza createPizza(PizzaStyleEnum.PizzaStyle type) {
        BasePizza basePizza = null;
        switch (type) {
            case Cheese:
                basePizza = new NyStyleCheesePizza();
                break;
            case Clam:
                basePizza = new NyStyleClamPizza();
                break;
            case Veggle:
                basePizza = new NyStyleVegglePizza();
                break;
            default:
        }
        return basePizza;
    }
}
