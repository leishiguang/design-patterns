package pattern.structural.proxy.b;


import java.lang.reflect.Proxy;

/**
 *
 * @author leishiguang
 * date  2018/10/4 11:19
 * @version v1.0
 */
public class MainB {

    static void customer(ProxyInterface pi) {
        pi.say();
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        ProxyInterface proxy = (ProxyInterface)
                Proxy.newProxyInstance(
                        ProxyInterface.class.getClassLoader(),
                        new Class[]{ProxyInterface.class},
                        new ProxyObject(real));
        customer(proxy);
    }
}
