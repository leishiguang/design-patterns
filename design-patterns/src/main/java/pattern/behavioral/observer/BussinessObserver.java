package pattern.behavioral.observer;

/**
 * 业务数据观察者接口
 *
 * @author leishiguang
 * date  2018/9/10 10:03
 * @version v1.0
 */
public interface BussinessObserver {
    void sendMessage(String message);
}
