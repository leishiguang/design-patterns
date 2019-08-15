package com.ray.command.remote;

import MethodInvocation.Command;
import MethodInvocation.Furniture.Stereo;

/**
 * 实现产品的命令接口
 *
 * @author leishiguang
 * date  2018/8/14 14:09
 * @version v1.0
 */
public class SteroOffCommand implements Command {

    private Stereo stereo;

    public SteroOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
