package com.ray.command.remote;

import MethodInvocation.Command;
import MethodInvocation.Furniture.Stereo;

/**
 * 实现产品的命令接口
 *
 * @author leishiguang
 * date  2018/8/14 14:08
 * @version v1.0
 */
public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }
}
