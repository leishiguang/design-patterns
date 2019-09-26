package pattern.creational.factory.abstracted.ingredientfactory;

import pattern.creational.factory.abstracted.ingredient.base.*;

import java.util.ArrayList;

/**
 * 原料工厂的基础方法
 *
 * @author leishiguang
 * date  2018/8/8 20:55
 * @version v1.0
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

    ArrayList<String> createToppings();
}
