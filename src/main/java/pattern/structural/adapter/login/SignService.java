package pattern.structural.adapter.login;

/**
 * 老系统的登陆
 *
 * @author leishiguang
 * @since v1.0
 */
public class SignService {

    public ResultMsg regist(String userName, String password) {
        return new ResultMsg(200, "注册成功", new Member());
    }

    public ResultMsg login(String userName, String passwork) {
        return null;
    }
}
