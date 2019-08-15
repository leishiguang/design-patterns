package com.ray.decorator.humburger;

/**
 * 汉堡基类
 *
 * @author leishiguang
 * date  2018/10/2 10:02
 * @version v1.0
 */
public abstract class Humburger {

    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();

}
