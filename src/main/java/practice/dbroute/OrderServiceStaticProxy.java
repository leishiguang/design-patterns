package practice.dbroute;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 切换数据源的代理类
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        changeDbSource(order);
        int result = orderService.createOrder(order);
        after();
        return result;
    }

    private void before() {
        System.out.println("Proxy before Method");
    }

    private void changeDbSource(Order order) {
        Date time = order.getCreateTime();
        int dbRouter = Integer.parseInt(yearFormat.format(time));
        System.out.println("静态代理类自动分配到[DB_" + dbRouter + "]处理数据");
        DynamicDataSourceEntry.set(dbRouter);
    }


    private void after() {
        System.out.println("Proxy after Method");
    }
}
