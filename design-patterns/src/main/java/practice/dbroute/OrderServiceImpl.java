package practice.dbroute;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class OrderServiceImpl implements IOrderService {

    private OrderDao orderDao;

    public OrderServiceImpl() {
        // 模拟 Spring 自动注入
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderServiceImpl 创建 Order");
        orderDao.insert(order);
        return 0;
    }
}
