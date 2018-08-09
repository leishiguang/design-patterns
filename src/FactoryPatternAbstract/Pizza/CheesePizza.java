package FactoryPatternAbstract.Pizza;

import FactoryPatternAbstract.IngredientFactory.PizzaIngredientFactory;

/**
 * CheesePizza
 *
 * @author LeiShiGuang
 * Date  2018/8/9 19:41
 * @version v1.0
 */
public class CheesePizza extends Pizza {

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
        viggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
        //clam = ingredientFactory.createClam();
    }
}
