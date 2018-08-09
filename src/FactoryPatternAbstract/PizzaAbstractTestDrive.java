package FactoryPatternAbstract;

import FactoryPatternAbstract.Pizza.Pizza;
import FactoryPatternAbstract.Store.NYPizzaStore;
import FactoryPatternAbstract.Store.PizzaStore;

/**
 * 测试方法
 *
 * @author LeiShiGuang
 * Date  2018/8/9 20:03
 * @version v1.0
 */
public class PizzaAbstractTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("Cheese");
        //pizza = nyStore.orderPizza(PizzaStyleEnum.PizzaStyle.Cheese);
        System.out.println("First ordered a " + pizza.getName() + "\n");
        pizza = nyStore.orderPizza("Clam");
        //pizza = nyStore.orderPizza(PizzaStyleEnum.PizzaStyle.Clam);
        System.out.println("Second ordered a " + pizza.getName() + "\n");
        pizza = nyStore.orderPizza("Veggle");
        //pizza = nyStore.orderPizza(PizzaStyleEnum.PizzaStyle.Veggle);
        System.out.println("Third ordered a " + pizza.getName() + "\n");
    }
}
