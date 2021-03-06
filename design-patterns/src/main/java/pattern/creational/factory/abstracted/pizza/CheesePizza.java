package pattern.creational.factory.abstracted.pizza;

import pattern.creational.factory.abstracted.ingredientfactory.PizzaIngredientFactory;

/**
 * CheesePizza
 *
 * @author leishiguang
 * date  2018/8/9 19:41
 * @version v1.0
 */
public class CheesePizza extends BasePizza {

    private PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
        //clam = ingredientFactory.createClam();
    }
}
