package pattern.structural.adapter.login;

/**
 * @author leishiguang
 * @since v1.0
 */
public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        System.out.println("login for qq");
        return null;
    }
}
