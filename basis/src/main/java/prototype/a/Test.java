package prototype.a;

import java.util.ArrayList;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {

    public static void main(String[] args) {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(18);
        concretePrototype.setName("hello");
        concretePrototype.setHobbies(new ArrayList());
        System.out.println(concretePrototype);

        //创建 client 对象，准备开始克隆
        Client client = new Client(concretePrototype);
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone();
        System.out.println(concretePrototypeClone);

        System.out.println("原始对象，引用地址：" + System.identityHashCode(concretePrototype.getHobbies()));
        System.out.println("克隆对象，引用地址：" + System.identityHashCode(concretePrototypeClone.getHobbies()));
        System.out.println("对象地址比较：" + (System.identityHashCode(concretePrototype.getHobbies()) == System.identityHashCode(concretePrototypeClone.getHobbies())));

    }
}
