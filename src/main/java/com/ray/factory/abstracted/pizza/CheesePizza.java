package com.ray.factory.abstracted.pizza;

import com.ray.factory.abstracted.ingredientfactory.PizzaIngredientFactory;

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
        viggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
        //clam = ingredientFactory.createClam();
    }
}
