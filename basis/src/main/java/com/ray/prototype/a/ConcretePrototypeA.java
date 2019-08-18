package com.ray.prototype.a;

import java.util.List;

/**
 * 需要克隆的类
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class ConcretePrototypeA implements Prototype {

    private int age;
    private String name;
    private List hobbies;

    @Override
    public Prototype clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHobbies(this.hobbies);
        return concretePrototype;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }
}
