package com.ray.command;

import MethodInvocation.Remote.*;
import MethodInvocation.Furniture.CeilingFan;
import MethodInvocation.Furniture.GarageDoor;
import MethodInvocation.Furniture.Light;
import MethodInvocation.Furniture.Stereo;

/**
 * 遥控控制器的测试方法
 *
 * @author leishiguang
 * date  2018/8/14 14:12
 * @version v1.0
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(7);

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Default GarageDoor");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand KitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand KitchenLightOff = new LightOffCommand(kitchenLight);
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorOff = new GarageDoorDownCommand(garageDoor);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        SteroOffCommand steroOff = new SteroOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, KitchenLightOn, KitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorOff);
        remoteControl.setCommand(4, stereoOnWithCD, steroOff);

        System.out.println(remoteControl);

        for (int i = 0; i < remoteControl.getSoltSum(); i++) {
            remoteControl.onButtonWasPushed(i);
            remoteControl.offButtonWasPushed(i);
        }
    }
}
