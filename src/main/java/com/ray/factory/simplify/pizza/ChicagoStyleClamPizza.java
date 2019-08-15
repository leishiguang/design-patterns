package com.ray.factory.simplify.pizza;

/**
 * 具体的产品
 *
 * @author leishiguang
 * date  2018/8/9 8:38
 * @version v1.0
 */
public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Thin Clam Dough _ ChicagoStyleClamPizza";
        sauce = "Marnara Sauce _ ChicagoStyleClamPizza";

        toppings.add("Grated Reggiano Cheese _ ChicagoStyleClamPizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 50 minutes at 400.");
    }
}
