package com.ray.factory.simplify.pizza;

/**
 * 具体的产品
 *
 * @author leishiguang
 * date  2018/8/9 8:36
 * @version v1.0
 */
public class NYStyleVegglePizza extends Pizza {

    public NYStyleVegglePizza() {
        name = "NY Style Veggle Pizza";
        dough = "Thin Clam Dough _ NYStyleVegglePizza";
        sauce = "Marnara Sauce _ NYStyleVegglePizza";

        toppings.add("Grated Reggiano Cheese _ NYStyleVegglePizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 20 minutes at 320.");
    }
}
