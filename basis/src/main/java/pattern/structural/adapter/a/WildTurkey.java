package pattern.structural.adapter.a;

/**
 * @author leishiguang
 * date  2018/10/19 9:56
 * @version v1.0
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
