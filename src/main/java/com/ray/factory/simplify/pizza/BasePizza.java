package com.ray.factory.simplify.pizza;

import java.util.ArrayList;

/**
 * 所有产品必须实现的共同接口，这样，这些产品就可以引用接口，而不是具体的类。
 *
 * @author leishiguang
 * date  2018/8/8 20:29
 * @version v1.0
 */
public abstract class BasePizza {

    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tosing dough.." + dough);
        System.out.println("Adding sauce.." + sauce);
        System.out.println("Adding toppings:");
        for (String topping : toppings) {
            System.out.println("\t" + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official BasePizzaStore box");
    }

    public String getName() {
        return name;
    }
}
