package factory.abstracted.pizza;

import factory.abstracted.ingredientfactory.PizzaIngredientFactory;

/**
 * VeggiesPizza
 *
 * @author leishiguang
 * date  2018/8/9 19:50
 * @version v1.0
 */
public class VeggiesPizza extends BasePizza {
    private PizzaIngredientFactory ingredientFactory;

    public VeggiesPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
