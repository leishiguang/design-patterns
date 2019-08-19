package com.ray.delegate.a;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我现在开始干" + command + "工作");
    }
}
