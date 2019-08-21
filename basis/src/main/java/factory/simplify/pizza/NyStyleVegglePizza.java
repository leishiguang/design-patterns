package factory.simplify.pizza;

/**
 * 具体的产品
 *
 * @author leishiguang
 * date  2018/8/9 8:36
 * @version v1.0
 */
public class NyStyleVegglePizza extends BasePizza {

    public NyStyleVegglePizza() {
        name = "NY Style Veggle BasePizza";
        dough = "Thin Clam Dough _ NyStyleVegglePizza";
        sauce = "Marnara Sauce _ NyStyleVegglePizza";

        toppings.add("Grated Reggiano Cheese _ NyStyleVegglePizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake for 20 minutes at 320.");
    }
}
