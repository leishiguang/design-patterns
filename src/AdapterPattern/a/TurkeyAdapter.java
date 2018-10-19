package AdapterPattern.a;

/**
 * 火鸡冒充鸭子
 *
 * @author LeiShiGuang
 * Date  2018/10/19 9:57
 * @version v1.0
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
