package decorator.human;

/**
 * 测试方法
 *
 * @author leishiguang
 * date  2018/10/2 9:57
 * @version v1.0
 */
public class DecoratorTestDrive {

    public static void main(String[] args) {
        Human person = new Person();
        Decorator decorator = new Decorator_two(new Decorator_first(
                new Decorator_zero(person)));
        decorator.wearClothes();
        decorator.walkToWhere();
    }

}
