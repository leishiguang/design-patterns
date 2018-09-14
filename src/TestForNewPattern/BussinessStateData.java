package TestForNewPattern;

import java.util.ArrayList;

/**
 * 状态数据，是一个具体的主题
 *
 * @author LeiShiGuang
 * Date  2018/9/10 10:02
 * @version v1.0
 */
public class BussinessStateData implements BussinessStateSubject {

    private ArrayList<BussinessObserver> observers;//记录观察者
    private String bussiness_id;//业务号
    private String state;//业务状态

    BussinessStateData() {
        observers = new ArrayList<BussinessObserver>();
    }

    @Override
    public void addObserver(BussinessObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(BussinessObserver observer) {
        int index = observers.indexOf(observer);
        if (index > 0) {
            observers.remove(index);
        }
    }

    @Override
    public void noticyObserver() {
        for (BussinessObserver observer : observers) {
            observer.sendMessage(this.state);
        }
    }

    private void stateChanged() {
        this.noticyObserver();
    }

    public void setState(String str) {
        this.state = str;
        this.stateChanged();
    }
}
