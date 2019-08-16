package com.ray.responsibility.b;

/**
 * TODO(用一句话描述该文件做什么)
 *
 * @author leishiguang
 * date  2018/10/27 11:51
 * @version v1.0
 */
public class ManagerHandler implements Handler {

    private Handler nextHandler;

    @Override
    public void handLeave(LeaveNote leaveNote) {
        System.out.println("总经理同意" + leaveNote.getName() + "申请请假" + leaveNote.getLeaverDayNum() + "天，原因：" + leaveNote.getLeveReason());
    }

    @Override
    public void setNextHandler(Handler h) {
        nextHandler = h;
    }
}
