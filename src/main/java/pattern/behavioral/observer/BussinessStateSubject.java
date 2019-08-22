package pattern.behavioral.observer;

/**
 * 观察者模式通知类，主题接口
 *
 * @author leishiguang
 * date  2018/9/10 10:03
 * @version v1.0
 */
public interface BussinessStateSubject {
    //添加观察者
    void addObserver(BussinessObserver observer);

    //删除观察者
    void deleteObserver(BussinessObserver observer);

    //通知观察者
    void noticyObserver();
}
