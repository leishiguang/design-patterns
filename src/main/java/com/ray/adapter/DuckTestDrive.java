package com.ray.adapter;

import com.ray.adapter.a.Duck;
import com.ray.adapter.a.MallardDuck;
import com.ray.adapter.a.TurkeyAdapter;
import com.ray.adapter.a.WildTurkey;

/**
 * @author leishiguang
 * date  2018/10/19 9:59
 * @version v1.0
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
