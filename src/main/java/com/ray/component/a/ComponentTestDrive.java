package com.ray.component.a;

import java.util.Iterator;

/**
 * @author leishiguang
 * date  2018/10/26 23:05
 * @version v1.0
 */
public class ComponentTestDrive {
    public static void main(String[] args) {
        BaseComponent root = new CompositeComponent("Root Component");
        BaseComponent one = new CompositeComponent("One");
        BaseComponent two = new CompositeComponent("Two");
        BaseComponent three = new CompositeComponent("Three");
        BaseComponent oneOne = new CompositeComponent("One_one");
        BaseComponent oneTwo = new CompositeComponent("One_two");
        BaseComponent twoOne = new CompositeComponent("Two_one");
        BaseComponent oneOneLeefOne = new LeefComponent("One_one Leef One");
        BaseComponent oneOneLeefTwo = new LeefComponent("One_one Leef Two");
        BaseComponent oneTwoLeefOne = new LeefComponent("One_two Leef One");
        BaseComponent twoLeefOne = new LeefComponent("Two Leef One");
        BaseComponent threeLeefOne = new LeefComponent("Three Leef One");
        BaseComponent threeLeefTwo = new LeefComponent("Three Leef Two");

        root.add(one);
        root.add(two);
        root.add(three);

        one.add(oneOne);
        one.add(oneTwo);
        two.add(twoOne);
        two.add(twoLeefOne);
        three.add(threeLeefOne);
        three.add(threeLeefTwo);
        oneOne.add(oneOneLeefOne);
        oneOne.add(oneOneLeefTwo);
        oneTwo.add(oneTwoLeefOne);

        root.print();

        Iterator rootIterator = root.createIterator();
        while (rootIterator.hasNext()) {
            System.out.println(((BaseComponent) rootIterator.next()).getName());
        }
    }

}
