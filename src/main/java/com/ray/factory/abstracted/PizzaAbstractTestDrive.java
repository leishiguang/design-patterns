package com.ray.factory.abstracted;

import com.ray.factory.abstracted.pizza.BasePizza;
import com.ray.factory.abstracted.store.NYPizzaStore;
import com.ray.factory.abstracted.store.PizzaStore;

/**
 * 抽象工厂测试方法
 *
 * @author leishiguang
 * date  2018/8/9 20:03
 * @version v1.0
 */
public class PizzaAbstractTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        BasePizza pizza = nyStore.orderPizza("Cheese");
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
