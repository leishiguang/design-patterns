package ProxyInstance.b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 *
 * @author LeiShiGuang
 * Date  2018/10/4 11:18
 * @version v1.0
 */
public class ProxyObject implements InvocationHandler {
    private Object proxied = null;

    public ProxyObject() {

    }

    public ProxyObject(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
        System.out.println("hello");
        return arg1.invoke(proxied, arg2);
    }

    ;
}
