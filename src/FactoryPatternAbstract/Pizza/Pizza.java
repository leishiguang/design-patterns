package FactoryPatternAbstract.Pizza;

import FactoryPatternAbstract.Ingredient.base.*;

import java.util.ArrayList;

/**
 * 所有产品必须实现的共同接口，这样，这些产品就可以引用接口，而不是具体的类。
 *
 * @author LeiShiGuang
 * Date  2018/8/8 20:29
 * @version v1.0
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies viggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    ArrayList<String> toppings = new ArrayList<>();


    /**
     * 这时候的 Pizza 的准备交给具体的 Pizza 种类
     */
    public abstract void prepare();

   /* public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tosing dough.." + dough);
        System.out.println("Adding sauce.." + sauce);
        System.out.println("Adding toppings:");
        for(String topping:toppings){
            System.out.println("\t"+topping);
        }
    }*/

    public void bake() {
        System.out.println("Bake for 25 minutes at 350.");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "";
    }
}
