package pattern.behavioral.delegate.a;

/**
 * Boss
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Boss {
    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
