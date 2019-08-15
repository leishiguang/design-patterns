package com.ray.factory.abstracted.store;

import com.ray.factory.abstracted.pizza.CheesePizza;
import com.ray.factory.abstracted.pizza.ClamPizza;
import com.ray.factory.abstracted.pizza.BasePizza;
import com.ray.factory.abstracted.ingredientfactory.NYPizzaIngredientFactory;
import com.ray.factory.abstracted.ingredientfactory.PizzaIngredientFactory;
import com.ray.factory.abstracted.pizza.VegglePizza;
import com.ray.factory.simplify.store.PizzaStyleEnum;

/**
 * NyPizzaStore
 *
 * @author leishiguang
 * date  2018/8/9 19:47
 * @version v1.0
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    BasePizza createPizza(PizzaStyleEnum.PizzaStyle type) {
        BasePizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case Clam:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam BasePizza.");
                break;
            case Cheese:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese BasePizza.");
                break;
            case Veggle:
                pizza = new VegglePizza(ingredientFactory);
                pizza.setName("New York Style Veggle BasePizza.");
                break;
            default:
        }
        return pizza;
    }
}
