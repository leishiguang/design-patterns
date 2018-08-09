package FactoryPattern.Pizza;

/**
 * 具体的产品
 *
 * @author LeiShiGuang
 * Date  2018/8/8 20:41
 * @version v1.0
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marnara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
