package FactoryPattern;

import FactoryPattern.Pizza.Pizza;
import FactoryPattern.Store.ChicagoPizzaStore;
import FactoryPattern.Store.NYPizzaStore;
import FactoryPattern.Store.PizzaStore;
import FactoryPattern.Store.PizzaStyleEnum;

/**
 * 工厂方法测试
 *
 * @author LeiShiGuang
 * Date  2018/8/8 20:46
 * @version v1.0
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("1Cheese");
        //pizza = nyStore.orderPizza(PizzaStyleEnum.PizzaStyle.Cheese);
        System.out.println("First ordered a " + pizza.getName() + "\n");
        pizza = nyStore.orderPizza("Clam");
        //pizza = nyStore.orderPizza(PizzaStyleEnum.PizzaStyle.Clam);
        System.out.println("Second ordered a " + pizza.getName() + "\n");
        pizza = nyStore.orderPizza("Veggle");
        //pizza = nyStore.orderPizza(PizzaStyleEnum.PizzaStyle.Veggle);
        System.out.println("Third ordered a " + pizza.getName() + "\n");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        //pizza = chicagoStore.orderPizza("cheese");
        pizza = chicagoStore.orderPizza(PizzaStyleEnum.PizzaStyle.Cheese);
        System.out.println("Forth ordered a " + pizza.getName() + "\n");
        //pizza = chicagoStore.orderPizza("clam");
        pizza = chicagoStore.orderPizza(PizzaStyleEnum.PizzaStyle.Clam);
        System.out.println("Fifth ordered a " + pizza.getName() + "\n");
        //pizza = chicagoStore.orderPizza("veggle");
        pizza = chicagoStore.orderPizza(PizzaStyleEnum.PizzaStyle.Veggle);
        System.out.println("Sixth ordered a " + pizza.getName() + "\n");

    }
}
