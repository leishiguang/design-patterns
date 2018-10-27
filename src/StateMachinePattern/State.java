package StateMachinePattern;

/**
 * @author LeiShiGuang
 * Date  2018/10/27 8:19
 * @version v1.0
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
