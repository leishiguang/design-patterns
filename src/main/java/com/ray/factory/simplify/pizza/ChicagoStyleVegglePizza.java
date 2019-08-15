package com.ray.factory.simplify.pizza;

/**
 * 具体的产品
 *
 * @author leishiguang
 * date  2018/8/9 8:39
 * @version v1.0
 */
public class ChicagoStyleVegglePizza extends Pizza {
    public ChicagoStyleVegglePizza() {
        name = "Chicago Style Veggle Pizza";
        dough = "Thin Clam Dough _ ChicagoStyleVegglePizza";
        sauce = "Marnara Sauce _ ChicagoStyleVegglePizza";

        toppings.add("Grated Reggiano Cheese _ ChicagoStyleVegglePizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 50 minutes at 400.");
    }
}
