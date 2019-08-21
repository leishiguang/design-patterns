package factory.abstracted.pizza;

import factory.abstracted.ingredientfactory.PizzaIngredientFactory;

/**
 * ClamPizza
 *
 * @author leishiguang
 * date  2018/8/9 19:45
 * @version v1.0
 */
public class ClamPizza extends BasePizza {

    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
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
        clam = ingredientFactory.createClam();
        toppings = ingredientFactory.createToppings();
    }
}
