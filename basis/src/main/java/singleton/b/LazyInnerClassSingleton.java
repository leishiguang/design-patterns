package singleton.b;

/**
 * 懒汉模式：从类初始化的角度考虑，采用静态内部类的方法（推荐）
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY_INNER_CLASS_SINGLETON != null) {
            throw new RuntimeException("不允许通过反射创建");
        }
    }

    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY_INNER_CLASS_SINGLETON;
    }

    /**
     * 默认不加载
     */
    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY_INNER_CLASS_SINGLETON = new LazyInnerClassSingleton();
    }
}
