package pattern.creational.singleton.b;

/**
 * 饿汉单例的另外一种写法
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
