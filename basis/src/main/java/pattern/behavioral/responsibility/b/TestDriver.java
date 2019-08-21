package pattern.behavioral.responsibility.b;

/**
 * @author leishiguang
 * date  2018/10/27 11:53
 * @version v1.0
 */
public class TestDriver {

    static Handler getHandler() {
        DirectorHandler directorHandler = new DirectorHandler();
        ViceManagerHandler viceManagerHandler = new ViceManagerHandler();
        ManagerHandler managerHandler = new ManagerHandler();
        //也可以通过容器来管理职责对象，不使用setNextHandler
        directorHandler.setNextHandler(viceManagerHandler);
        viceManagerHandler.setNextHandler(managerHandler);
        return directorHandler;
    }

    public static void main(String[] args) {
        LeaveNote leaveNote1 = new LeaveNote("小肚", "肚子疼", 3);
        LeaveNote leaveNote2 = new LeaveNote("小婚", "婚假", 5);
        LeaveNote leaveNote3 = new LeaveNote("小不", "补休", 8);

        Handler handler = getHandler();
        handler.handLeave(leaveNote1);
        handler.handLeave(leaveNote2);
        handler.handLeave(leaveNote3);
    }
}
