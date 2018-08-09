package FactoryPatternAbstract.Store;

import FactoryPatternAbstract.Pizza.CheesePizza;
import FactoryPatternAbstract.Pizza.ClamPizza;
import FactoryPatternAbstract.Pizza.Pizza;
import FactoryPattern.Store.PizzaStyleEnum;
import FactoryPatternAbstract.IngredientFactory.NYPizzaIngredientFactory;
import FactoryPatternAbstract.IngredientFactory.PizzaIngredientFactory;
import FactoryPatternAbstract.Pizza.VegglePizza;

/**
 * NYPizzaStore
 *
 * @author LeiShiGuang
 * Date  2018/8/9 19:47
 * @version v1.0
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(PizzaStyleEnum.PizzaStyle type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case Clam:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza.");
                break;
            case Cheese:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza.");
                break;
            case Veggle:
                pizza = new VegglePizza(ingredientFactory);
                pizza.setName("New York Style Veggle Pizza.");
                break;
        }
        return pizza;
    }
}
