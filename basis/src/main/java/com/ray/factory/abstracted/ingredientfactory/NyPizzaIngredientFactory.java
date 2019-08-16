package com.ray.factory.abstracted.ingredientfactory;

import com.ray.factory.abstracted.ingredient.newyork.*;
import com.ray.factory.abstracted.ingredient.veggies.Garlic;
import com.ray.factory.abstracted.ingredient.veggies.Mushroom;
import com.ray.factory.abstracted.ingredient.veggies.Onion;
import com.ray.factory.abstracted.ingredient.veggies.RedPepper;
import com.ray.factory.abstracted.ingredient.base.*;
import com.ray.factory.abstracted.ingredient.base.Dough;

import java.util.ArrayList;

/**
 * 纽约原料工厂，提供纽约 BasePizzaStore 所需要的原材料
 *
 * @author leishiguang
 * date  2018/8/8 20:58
 * @version v1.0
 */
public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NewYorkDough();
    }

    @Override
    public Sauce createSauce() {
        return new NewYorkSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NewYorkCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NewYorkPepperoni();
    }

    @Override
    public Clams createClam() {
        return new NewYorkClams();
    }

    @Override
    public ArrayList<String> createToppings() {
        ArrayList<String> toppings = new ArrayList<>();
        toppings.add("NewYourkToppings");
        return toppings;
    }
}
