package ChainOfResponsibilityPattern.b;

/**
 * TODO(用一句话描述该文件做什么)
 *
 * @author LeiShiGuang
 * Date  2018/10/27 11:48
 * @version v1.0
 */
public class DirectorHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handLeave(LeaveNote leaveNote) {
        if (leaveNote.getLeaverDayNum() <= 3) {
            System.out.println("主管同意" + leaveNote.getName() + "申请请假" + leaveNote.getLeaverDayNum() + "天，原因：" + leaveNote.getLeveReason());
        } else {
            nextHandler.handLeave(leaveNote);
        }
    }

    @Override
    public void setNextHandler(Handler h) {
        nextHandler = h;
    }
}
