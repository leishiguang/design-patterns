package MethodInvocation.Remote;

import MethodInvocation.Command;
import MethodInvocation.Furniture.GarageDoor;

/**
 * 实现产品的命令接口
 *
 * @author LeiShiGuang
 * Date  2018/8/14 14:21
 * @version v1.0
 */
public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.stop();
        garageDoor.down();
        garageDoor.lightOff();
    }
}
