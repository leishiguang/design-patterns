package com.ray.dbroute;

/**
 * 动态切换数据源
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class DynamicDataSourceEntry {
    /**
     * 默认数据源
     */
    public final static String DEFAULT_SOURCE = null;

    private final static ThreadLocal<String> LOCAL = new ThreadLocal<>();

    private DynamicDataSourceEntry() {

    }

    /**
     * 清空数据源
     */
    public static void clear() {
        LOCAL.remove();
    }

    /**
     * 还原默认数据源
     */
    public static void restore() {
        LOCAL.set(DEFAULT_SOURCE);
    }

    /**
     * 设置数据源
     */
    public static void set(String source) {
        LOCAL.set(source);
    }

    /**
     * 根据年份动态设置数据源
     */
    public static void set(int year) {
        LOCAL.set("DB_" + year);
    }
}
