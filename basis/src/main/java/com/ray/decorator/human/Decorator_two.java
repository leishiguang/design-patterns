package com.ray.decorator.human;

/**
 * 一种装饰
 *
 * @author leishiguang
 * date  2018/10/2 9:54
 * @version v1.0
 */
public class Decorator_two extends Decorator {

    Decorator_two(Human human) {
        super(human);
    }

    private void findClothes() {
        System.out.println("找到一件D&G。。");
    }

    private void findTheTarget() {
        System.out.println("在Map上找到神秘花园和城堡。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        findClothes();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findTheTarget();
    }
}
