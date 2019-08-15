package com.ray.factory.simplify.pizza;

/**
 * 具体的产品
 *
 * @author leishiguang
 * date  2018/8/9 8:36
 * @version v1.0
 */
public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Clam Dough _ NYStyleClamPizza";
        sauce = "Marnara Sauce _ NYStyleClamPizza";

        toppings.add("Grated Reggiano Cheese _ NYStyleClamPizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 50 minutes at 400.");
    }
}
