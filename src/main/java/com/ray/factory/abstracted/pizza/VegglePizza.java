package com.ray.factory.abstracted.pizza;

import FactoryPatternAbstract.IngredientFactory.PizzaIngredientFactory;

/**
 * VegglePizza
 *
 * @author leishiguang
 * date  2018/8/9 19:50
 * @version v1.0
 */
public class VegglePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public VegglePizza(PizzaIngredientFactory ingredientFactory) {
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
