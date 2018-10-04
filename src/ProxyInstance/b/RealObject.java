package ProxyInstance.b;

/**
 * 被代理类
 *
 * @author LeiShiGuang
 * Date  2018/10/4 11:17
 * @version v1.0
 */
public class RealObject implements ProxyInterface {
    @Override
    public void say() {
        System.out.println("i'm talking");
    }
}
