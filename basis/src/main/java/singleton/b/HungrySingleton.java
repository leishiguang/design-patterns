package singleton.b;

/**
 * 饿汉单例
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class HungrySingleton {

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

}
