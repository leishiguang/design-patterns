package com.ray.decorator.human;

/**
 * 一种装饰
 *
 * @author leishiguang
 * date  2018/10/2 9:53
 * @version v1.0
 */
public class Decorator_first extends Decorator {

    Decorator_first(Human human) {
        super(human);
    }

    private void goClothespress() {
        System.out.println("去衣柜找找看。。");
    }

    private void findPlaceOnMap() {
        System.out.println("在Map上找找。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goClothespress();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findPlaceOnMap();
    }
}
