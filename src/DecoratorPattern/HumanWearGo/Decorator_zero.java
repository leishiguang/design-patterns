package DecoratorPattern.HumanWearGo;

/**
 * 一种装饰
 *
 * @author LeiShiGuang
 * Date  2018/10/2 9:51
 * @version v1.0
 */
public class Decorator_zero extends Decorator {

    Decorator_zero(Human human) {
        super(human);
    }

    private void goHome() {
        System.out.println("进房子。。");
    }

    private void findMap() {
        System.out.println("书房找找Map。。");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        goHome();
    }

    @Override
    public void walkToWhere() {
        super.walkToWhere();
        findMap();
    }
}
