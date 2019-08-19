package com.ray.delegate.a;

import java.util.HashMap;
import java.util.Map;

/**
 * 领导
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Leader implements IEmployee {

    private Map<String, IEmployee> targets = new HashMap<>();

    public Leader() {
        targets.put("加密", new EmployeeA());
        targets.put("登录", new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
