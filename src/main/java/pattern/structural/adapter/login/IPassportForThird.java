package pattern.structural.adapter.login;


/**
 * 第三方登陆兼容接口
 *
 * @author leishiguang
 * @since v1.0
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String id);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForSina(String userName, String token);
}
