package TestForNewPattern;

import TestForNewPattern.BussinessObserverPackage.BdcBussinessObserver;
import TestForNewPattern.BussinessObserverPackage.SwBussinessObserver;

/**
 * TODO(用一句话描述该文件做什么)
 *
 * @author LeiShiGuang
 * Date  2018/9/10 10:30
 * @version v1.0
 */
public class testForNewPatternMain {

    public static void main(String args[]) throws InterruptedException {
        BussinessStateData stateData = new BussinessStateData();
        BdcBussinessObserver bdcObserver = new BdcBussinessObserver();
        SwBussinessObserver swObserver = new SwBussinessObserver();

        stateData.addObserver(bdcObserver);
        stateData.addObserver(swObserver);

        stateData.setState("My state has changed");
        stateData.setState("Change Again");

    }
}
