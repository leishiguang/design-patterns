package pattern.structural.adapter.login;

/**
 * 第三方的登陆服务，继承原有 SignService
 *
 * @author leishiguang
 * @since v1.0
 */
public class SigninForThirdService extends SignService {

    public ResultMsg loginForQQ(String openId) {
        //1、openId 全局唯一，可以当作是用户名
        //2、密码默认为 QQ_EMPTY
        //3、注册（在原有系统里面创建一个用户）
        //4、调用原来的登陆方法
        return loginForRegist(openId, null);
    }

    public ResultMsg loginForWechat(String openId) {
        //与 loginForQQ 类似
        return loginForRegist(openId, null);
    }

    private ResultMsg loginForRegist(String userName, String password) {
        super.regist(userName, password);
        return super.login(userName, password);
    }

}
