package AdapterPattern.a;

/**
 * @author LeiShiGuang
 * Date  2018/10/19 9:54
 * @version v1.0
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
