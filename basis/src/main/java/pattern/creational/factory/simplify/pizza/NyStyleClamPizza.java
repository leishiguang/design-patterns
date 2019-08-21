package pattern.creational.factory.simplify.pizza;

/**
 * 具体的产品
 *
 * @author leishiguang
 * date  2018/8/9 8:36
 * @version v1.0
 */
public class NyStyleClamPizza extends BasePizza {
    public NyStyleClamPizza() {
        name = "NY Style Clam BasePizza";
        dough = "Thin Clam Dough _ NyStyleClamPizza";
        sauce = "Marnara Sauce _ NyStyleClamPizza";

        toppings.add("Grated Reggiano Cheese _ NyStyleClamPizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 50 minutes at 400.");
    }
}
