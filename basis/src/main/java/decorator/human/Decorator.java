package decorator.human;


/**
 * 定义装饰者（装饰之后的对象）
 *
 * @author leishiguang
 * date  2018/10/2 9:49
 * @version v1.0
 */
public class Decorator implements Human {

    private Human human;

    Decorator(Human human) {
        this.human = human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void walkToWhere() {
        human.walkToWhere();
    }
}
