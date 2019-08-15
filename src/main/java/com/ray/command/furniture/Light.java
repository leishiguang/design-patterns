package com.ray.command.furniture;

/**
 * 产品
 *
 * @author leishiguang
 * date  2018/8/14 13:38
 * @version v1.0
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + ": Light is On.");
    }

    public void off() {
        System.out.println(name + ": Light is Off.");
    }

}
