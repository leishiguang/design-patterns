package FactoryPatternAbstract;

import FactoryPatternAbstract.*;

/**
 * TODO(用一句话描述该文件做什么)
 *
 * @author LeiShiGuang
 * Date  2018/8/8 20:55
 * @version v1.0
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();
}
