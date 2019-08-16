package com.ray.adapter.a;

/**
 * @author leishiguang
 * date  2018/10/19 9:54
 * @version v1.0
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack.");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
