package pattern.structural.adapter.login;

/**
 * 第三方登陆自由适配
 *
 * @author leishiguang
 * @since v1.0
 */
public class PassportForThirdAdapter extends SignService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String openId) {
        return processLogin(openId, LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForSina(String userName, String token) {
        return processLogin(userName, LoginForSinaAdapter.class);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        LoginAdapter adapter = null;
        try {
            adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            } else {
                System.out.println("不适配的登陆");
            }
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
