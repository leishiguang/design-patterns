package pattern.behavioral.strategy.payport;


/**
 * 测试
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {

    public static void main(String[] args) {
        // 创建订单
        Order order = new Order("1", "201803000101010000", 324.34);
        //开始支付，可以自由选择支付方式
        System.out.println(order.pay(PayStrategy.ALI_PAY));
    }


}
