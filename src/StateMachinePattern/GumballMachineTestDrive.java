package StateMachinePattern;

/**
 * @author LeiShiGuang
 * Date  2018/10/27 9:00
 * @version v1.0
 */
public class GumballMachineTestDrive {
    public static void main(String[] arts) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.getState());

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine.getState());
    }
}
