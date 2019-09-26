package pattern.behavioral.delegate.a;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("登录", new Leader());
    }
}
