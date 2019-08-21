package factory.simplify;


import factory.simplify.pizza.BasePizza;
import factory.simplify.store.BasePizzaStore;
import factory.simplify.store.ChicagoPizzaStore;
import factory.simplify.store.NyPizzaStore;
import factory.simplify.store.PizzaStyleEnum;

/**
 * 工厂方法测试
 *
 * @author leishiguang
 * date  2018/8/8 20:46
 * @version v1.0
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        BasePizzaStore nyStore = new NyPizzaStore();
        BasePizza basePizza = nyStore.orderPizza("1Cheese");
        //basePizza = nyStore.orderPizza(PizzaStyleEnum.PizzaStyle.Cheese);
        System.out.println("First ordered a " + basePizza.getName() + "\n");
        basePizza = nyStore.orderPizza("Clam");
        //basePizza = nyStore.orderPizza(PizzaStyleEnum.PizzaStyle.Clam);
        System.out.println("Second ordered a " + basePizza.getName() + "\n");
        basePizza = nyStore.orderPizza("Veggle");
        //basePizza = nyStore.orderPizza(PizzaStyleEnum.PizzaStyle.Veggle);
        System.out.println("Third ordered a " + basePizza.getName() + "\n");

        BasePizzaStore chicagoStore = new ChicagoPizzaStore();
        //basePizza = chicagoStore.orderPizza("cheese");
        basePizza = chicagoStore.orderPizza(PizzaStyleEnum.PizzaStyle.Cheese);
        System.out.println("Forth ordered a " + basePizza.getName() + "\n");
        //basePizza = chicagoStore.orderPizza("clam");
        basePizza = chicagoStore.orderPizza(PizzaStyleEnum.PizzaStyle.Clam);
        System.out.println("Fifth ordered a " + basePizza.getName() + "\n");
        //basePizza = chicagoStore.orderPizza("veggle");
        basePizza = chicagoStore.orderPizza(PizzaStyleEnum.PizzaStyle.Veggle);
        System.out.println("Sixth ordered a " + basePizza.getName() + "\n");

    }
}
