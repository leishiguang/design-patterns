package com.ray.singleton.b;

/**
 * 枚举单例（推荐）
 * 1、不能被反射
 * 2、通过类名和类对象找到一个唯一的枚举对象，不可能被类加载器加载多次
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public enum EnumSingleton {
    /* 枚举单例 */
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
