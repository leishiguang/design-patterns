package command;

import command.remote.NoCommand;

/**
 * 遥控控制器对象
 *
 * @author leishiguang
 * date  2018/8/14 13:48
 * @version v1.0
 */
public class RemoteControl {
    private int soltSum;
    private Command[] onCommands;
    private Command[] offCommands;


    RemoteControl(int soltSum) {
        this.soltSum = soltSum;
        onCommands = new Command[this.soltSum];
        offCommands = new Command[this.soltSum];

        Command noCommand = new NoCommand();
        for (int i = 0; i < this.soltSum; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    void setCommand(int solt, Command onCommand, Command offCommand) {
        onCommands[solt] = onCommand;
        offCommands[solt] = offCommand;
    }

    void onButtonWasPushed(int solt) {
        onCommands[solt].execute();
    }

    void offButtonWasPushed(int solt) {
        offCommands[solt].execute();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n----- Remote Control -----\n");
        for (int i = 0; i < this.soltSum; i++) {
            stringBuilder.append("[solt ").append(i).append("] ").append(onCommands[i].getClass().getName()).append("\t").append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuilder.toString();
    }

    int getSoltSum() {
        return this.soltSum;
    }
}
