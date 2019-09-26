package pattern.structural.adapter.login;

/**
 * @author leishiguang
 * @since v1.0
 */
public class SigninForThirdServiceTest {

    public static void main(String[] args) {

        SigninForThirdService signinForThirdService = new SigninForThirdService();
        signinForThirdService.loginForQQ("asdfasdfasdfasddfasdf");

        //这是优化过的
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("12123123213");
        passportForThird.loginForWechat("12123123213");
        passportForThird.loginForSina("12123123213", "123123");
    }
}
