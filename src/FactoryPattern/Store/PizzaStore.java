package FactoryPattern.Store;

import FactoryPattern.Pizza.Pizza;

/**
 * 工厂类，实现了操作产品的方法，不实现工厂方法。
 *
 * @author LeiShiGuang
 * Date  2018/8/8 20:28
 * @version v1.0
 */
public abstract class PizzaStore {

    /* 抽象的工厂方法，只有子类真正实现了某个类 */
    abstract Pizza createPizza(PizzaStyleEnum.PizzaStyle type);

    /* 操作产品的方法 */
    public Pizza orderPizza(Object type) {
        Pizza pizza = null;
        if (type.getClass() == PizzaStyleEnum.PizzaStyle.class) {
            pizza = createPizza((PizzaStyleEnum.PizzaStyle) type);
        } else if (type.getClass() == String.class) {
            pizza = createPizza((String) type);
        }
        assert pizza != null;
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /* 工厂方法，只有子类真正实现了某个类 */
    private Pizza createPizza(String strType) {
        PizzaStyleEnum.PizzaStyle type;
        try {
            type = PizzaStyleEnum.PizzaStyle.valueOf(strType);
        } catch (IllegalArgumentException e) {
            System.err.println("未找到对应的枚举类型：" + strType);
            System.err.println("系统默认为 Cheese");
            e.printStackTrace();
            type = PizzaStyleEnum.PizzaStyle.Cheese;
        }
        return createPizza(type);
    }


}

