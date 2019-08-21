package factory.simplify.pizza;

/**
 * 具体的产品
 *
 * @author leishiguang
 * date  2018/8/8 20:41
 * @version v1.0
 */
public class NyStyleCheesePizza extends BasePizza {
    public NyStyleCheesePizza() {
        name = "NY Style Sauce and Cheese BasePizza";
        dough = "Thin Crust Dough";
        sauce = "Marnara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
