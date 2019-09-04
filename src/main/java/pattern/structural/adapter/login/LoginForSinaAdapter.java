package pattern.structural.adapter.login;

/**
 * @author leishiguang
 * @since v1.0
 */
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        System.out.println("login for sina");
        return null;
    }
}
