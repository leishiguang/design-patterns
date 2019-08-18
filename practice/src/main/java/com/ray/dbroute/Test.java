package com.ray.dbroute;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date());
        IOrderService orderService = new OrderServiceStaticProxy(new OrderServiceImpl());
        orderService.createOrder(order);
    }
}
