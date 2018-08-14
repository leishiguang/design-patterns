package MethodInvocation;

/**
 * 简单遥控器
 *
 * @author LeiShiGuang
 * Date  2018/8/14 13:39
 * @version v1.0
 */
class SimpleRemoteControl {
    private Command solt;

    SimpleRemoteControl() {

    }

    void setCommand(Command command) {
        solt = command;
    }

    void buttonWasPressed() {
        solt.execute();
    }
}
