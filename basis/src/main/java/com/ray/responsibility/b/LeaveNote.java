package com.ray.responsibility.b;

/**
 * @author leishiguang
 * date  2018/10/27 11:46
 * @version v1.0
 */
public class LeaveNote {
    private String name;
    private String leveReason;
    private int leaverDayNum;


    public LeaveNote(String name, String leveReason, int leaverDayNum) {
        this.name = name;
        this.leveReason = leveReason;
        this.leaverDayNum = leaverDayNum;
    }

    public String getName() {
        return name;
    }

    public String getLeveReason() {
        return leveReason;
    }

    public int getLeaverDayNum() {
        return leaverDayNum;
    }
}
