package com.ray.responsibility.b;

/**
 * @author leishiguang
 * date  2018/10/27 11:54
 * @version v1.0
 */
public class ViceManagerHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void handLeave(LeaveNote leaveNote) {
        if (leaveNote.getLeaverDayNum() <= 5) {
            System.out.println("经理同意" + leaveNote.getName() + "申请请假" + leaveNote.getLeaverDayNum() + "天，原因：" + leaveNote.getLeveReason());
        } else {
            nextHandler.handLeave(leaveNote);
        }
    }

    @Override
    public void setNextHandler(Handler h) {
        nextHandler = h;
    }
}
