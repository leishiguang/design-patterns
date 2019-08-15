package com.ray.decorator.school;

/**
 * @author leishiguang
 * date  2018/10/30 20:55
 * @version v1.0
 */
public class Decorator extends SchoolReport {

    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
