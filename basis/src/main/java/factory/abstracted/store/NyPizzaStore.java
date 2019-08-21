package factory.abstracted.store;

import factory.abstracted.pizza.CheesePizza;
import factory.abstracted.pizza.ClamPizza;
import factory.abstracted.pizza.BasePizza;
import factory.abstracted.ingredientfactory.NyPizzaIngredientFactory;
import factory.abstracted.ingredientfactory.PizzaIngredientFactory;
import factory.abstracted.pizza.VeggiesPizza;
import factory.simplify.store.PizzaStyleEnum;

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
