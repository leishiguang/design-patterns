package pattern.creational.singleton.b;

/**
 * 懒汉模式，双重检查锁
 * 虽然比简单懒汉更号，但是使用 synchronized 总归是要上锁的...
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
