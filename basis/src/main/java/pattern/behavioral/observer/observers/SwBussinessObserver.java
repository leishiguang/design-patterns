package pattern.behavioral.observer.observers;

import pattern.behavioral.observer.BussinessObserver;

/**
 * 业务数据：税务的观察者
 *
 * @author leishiguang
 * date  2018/9/10 10:32
 * @version v1.0
 */
public class SwBussinessObserver implements BussinessObserver {
    @Override
    public void sendMessage(String message) {
        System.out.println("已经推送给税务: " + message);
    }
}
