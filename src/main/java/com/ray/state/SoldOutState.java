package com.ray.state;

/**
 * @author leishiguang
 * date  2018/10/27 8:26
 * @version v1.0
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry, It's sold out.(insertQuarter)");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, It's sold out.(ejectQuarter)");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sorry, It's sold out.(turnCrank)");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, It's sold out.(dispense)");
    }
}
