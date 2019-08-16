package com.ray.command;


import com.ray.command.furniture.Light;
import com.ray.command.remote.LightOnCommand;

/**
 * 简单测试
 *
 * @author leishiguang
 * date  2018/8/14 13:41
 * @version v1.0
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("Default Light");
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
    }
}
