package factory.simplify.pizza;

/**
 * 具体的产品
 *
 * @author leishiguang
 * date  2018/8/8 20:43
 * @version v1.0
 */
public class ChicagoStyleCheesePizza extends BasePizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese BasePizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
