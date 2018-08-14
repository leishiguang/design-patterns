package MethodInvocation.Remote;

import MethodInvocation.Command;
import MethodInvocation.Furniture.CeilingFan;

/**
 * 实现产品的命令接口
 *
 * @author LeiShiGuang
 * Date  2018/8/14 14:25
 * @version v1.0
 */
public class CeilingFanOnCommand implements Command {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.medium();
        ceilingFan.low();
        ceilingFan.high();
        ceilingFan.getSpeed();
    }
}
