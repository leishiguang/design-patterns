package com.ray.command.furniture;

/**
 * 产品
 *
 * @author leishiguang
 * date  2018/8/14 14:05
 * @version v1.0
 */
public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + ": Stereo is On.");
    }

    public void off() {
        System.out.println(name + ": Stereo is Off.");
    }

    public void setCd() {
        System.out.println(name + ": Stereo has set a CD.");
    }

    public void setDvd() {
        System.out.println(name + ": Stereo has set a DVD.");
    }

    public void setRadio() {
        System.out.println(name + ": Stereo has set a Radio.");
    }

    public void setVolume(int volume) {
        System.out.println(name + ": Stereo has set a Volume: " + volume);
    }
}
