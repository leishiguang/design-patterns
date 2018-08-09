package FactoryPatternAbstract.IngredientFactory;

import FactoryPatternAbstract.Ingredient.NewYork.*;
import FactoryPatternAbstract.Ingredient.Veggies.Garlic;
import FactoryPatternAbstract.Ingredient.Veggies.Mushroom;
import FactoryPatternAbstract.Ingredient.Veggies.Onion;
import FactoryPatternAbstract.Ingredient.Veggies.RedPepper;
import FactoryPatternAbstract.Ingredient.base.*;

import java.util.ArrayList;

/**
 * 纽约原料工厂，提供纽约 PizzaStore 所需要的原材料
 *
 * @author LeiShiGuang
 * Date  2018/8/8 20:58
 * @version v1.0
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
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
