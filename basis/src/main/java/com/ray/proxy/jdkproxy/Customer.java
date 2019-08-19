package com.ray.proxy.jdkproxy;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
    }
}
