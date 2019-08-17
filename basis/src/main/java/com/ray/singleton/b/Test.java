package com.ray.singleton.b;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * 一个测试类
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {

    public static void main(String[] args) throws Exception {
        instance();

    }

    /**
     * 反射破坏 LazyInnerClassSingleton
     */
    private static void instance() throws Exception {

        Class<?> clazz = LazyInnerClassSingleton.class;
        Constructor c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        //进行两次初始化
        Object o = LazyInnerClassSingleton.getInstance();
        Object o1 = c.newInstance();
        Object o2 = c.newInstance();
        System.out.println(o == o1);
        System.out.println(o1 == o2);
    }

    /**
     * 序列化破坏单例
     */
    private static void seriable() throws Exception {
    }
}
