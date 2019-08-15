package com.ray.reflect;

/**
 * @author leishiguang
 * date  2018/10/4 11:32
 * @version v1.0
 */
public class A {
    public int i = 1;
    public static int b = 2;

    public A() {
        System.out.println("无参构造");
    }

    private A(String s) {
        System.out.println("有参构造" + s);
    }

    public void say() {
        System.out.println("say");
    }
}
