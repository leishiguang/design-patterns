package singleton.b;

/**
 * 线程变量单例，在该线程中绝对唯一
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            ThreadLocal.withInitial(ThreadLocalSingleton::new);

    private ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}
