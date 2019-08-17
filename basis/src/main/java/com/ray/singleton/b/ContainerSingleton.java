package com.ray.singleton.b;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器单例
 * 适用于实例非常多的情况，便于管理。非线程安全。
 * 如 Spring 中的容器式单例模式，AbstractAutowireCapableBeanFactory
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class ContainerSingleton {
    private ContainerSingleton() {

    }

    private static final Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
