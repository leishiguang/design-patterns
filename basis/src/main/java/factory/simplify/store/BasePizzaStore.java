package factory.simplify.store;


import factory.simplify.pizza.BasePizza;

/**
 * 工厂类，实现了操作产品的方法，不实现工厂方法。
 *
 * @author leishiguang
 * date  2018/8/8 20:28
 * @version v1.0
 */
public abstract class BasePizzaStore {

    /**
     * 抽象的工厂方法，只有子类真正实现了某个类
     */
    abstract BasePizza createPizza(PizzaStyleEnum.PizzaStyle type);

    /**
     * 操作产品的方法
     */
    public BasePizza orderPizza(Object type) {
        BasePizza basePizza = null;
        if (type.getClass() == PizzaStyleEnum.PizzaStyle.class) {
            basePizza = createPizza((PizzaStyleEnum.PizzaStyle) type);
        } else if (type.getClass() == String.class) {
            basePizza = createPizza((String) type);
        }
        assert basePizza != null;
        basePizza.prepare();
        basePizza.bake();
        basePizza.cut();
        basePizza.box();
        return basePizza;
    }

    /**
     * 工厂方法，只有子类真正实现了某个类
     */
    private BasePizza createPizza(String strType) {
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

