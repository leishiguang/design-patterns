package command.remote;


import command.Command;
import command.furniture.Light;

/**
 * 实现产品的命令接口
 *
 * @author leishiguang
 * date  2018/8/14 14:01
 * @version v1.0
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
