package pattern.behavioral.command.remote;

import pattern.behavioral.command.Command;

/**
 * 实现产品的命令接口，当接口为空的时候。
 *
 * @author leishiguang
 * date  2018/8/14 13:51
 * @version v1.0
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("There is no Command.");
    }
}
