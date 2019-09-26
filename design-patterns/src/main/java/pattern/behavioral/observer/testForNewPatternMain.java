package pattern.behavioral.observer;


import pattern.behavioral.observer.observers.BdcBussinessObserver;
import pattern.behavioral.observer.observers.SwBussinessObserver;

/**
 * TODO(用一句话描述该文件做什么)
 *
 * @author leishiguang
 * date  2018/9/10 10:30
 * @version v1.0
 */
public class testForNewPatternMain {

    public static void main(String args[]) throws InterruptedException {
        BussinessStateData stateData = new BussinessStateData();
        BdcBussinessObserver bdcObserver = new BdcBussinessObserver();
        SwBussinessObserver swObserver = new SwBussinessObserver();

        stateData.addObserver(bdcObserver);
        stateData.addObserver(swObserver);

        stateData.setState("My pattern.behavioral.state has changed");
        stateData.setState("Change Again");

    }
}
