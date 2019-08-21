package factory.simplify.store;


import factory.simplify.pizza.*;
import factory.simplify.pizza.ChicagoStyleVegglePizza;
import factory.simplify.pizza.BasePizza;

/**
 * 实现了工厂方法，只负责制造具体产品，也只有这个类知道如何制造产品。
 *
 * @author leishiguang
 * date  2018/8/9 8:41
 * @version v1.0
 */
public class ChicagoPizzaStore extends BasePizzaStore {

    /*  实现了工厂方法，以便制造商品 */
    /*@Override
    BasePizza createPizza(String type) {
        BasePizza pizza = null;
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
    BasePizza createPizza(PizzaStyleEnum.PizzaStyle type) {
        BasePizza basePizza = null;
        switch (type) {
            case Cheese:
                basePizza = new ChicagoStyleCheesePizza();
                break;
            case Clam:
                basePizza = new ChicagoStyleClamPizza();
                break;
            case Veggle:
                basePizza = new ChicagoStyleVegglePizza();
                break;
            default:
        }
        return basePizza;
    }
}
