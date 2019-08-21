package pattern.creational.factory.abstracted.store;

import pattern.creational.factory.abstracted.pizza.CheesePizza;
import pattern.creational.factory.abstracted.pizza.ClamPizza;
import pattern.creational.factory.abstracted.pizza.BasePizza;
import pattern.creational.factory.abstracted.ingredientfactory.NyPizzaIngredientFactory;
import pattern.creational.factory.abstracted.ingredientfactory.PizzaIngredientFactory;
import pattern.creational.factory.abstracted.pizza.VeggiesPizza;
import pattern.creational.factory.simplify.store.PizzaStyleEnum;

/**
 * NyPizzaStore
 *
 * @author leishiguang
 * date  2018/8/9 19:47
 * @version v1.0
 */
public class NyPizzaStore extends BasePizzaStore {
    @Override
    BasePizza createPizza(PizzaStyleEnum.PizzaStyle type) {
        BasePizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
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
                pizza = new VeggiesPizza(ingredientFactory);
                pizza.setName("New York Style Veggle BasePizza.");
                break;
            default:
        }
        return pizza;
    }
}
