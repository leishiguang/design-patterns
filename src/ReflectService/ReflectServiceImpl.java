package ReflectService;


/**
 * 反射测试1
 *
 * @author LeiShiGuang
 * Date  2018/9/14 19:15
 * @version v1.0
 */
public class ReflectServiceImpl {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public ReflectServiceImpl getInstance() {
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl) Class.forName("ReflectService.ReflectServiceImpl").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }


}
