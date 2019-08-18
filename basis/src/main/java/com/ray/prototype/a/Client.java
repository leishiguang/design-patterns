package com.ray.prototype.a;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone() {
        return prototype.clone();
    }
}
