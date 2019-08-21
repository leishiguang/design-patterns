package command.remote;


import command.Command;
import command.furniture.GarageDoor;

/**
 * 实现产品的命令接口
 *
 * @author leishiguang
 * date  2018/8/14 14:20
 * @version v1.0
 */
public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
    }
}
