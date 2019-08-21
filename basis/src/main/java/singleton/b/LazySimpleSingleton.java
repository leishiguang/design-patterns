package singleton.b;

/**
 * 简单的懒汉模式（不推荐）
 * 缺点：大量线程访问的情况，synchronized 阻塞导致性能下降
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazySimpleSingleton = null;

    private LazySimpleSingleton() {
    }

    public synchronized static LazySimpleSingleton getInstance() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }

}
