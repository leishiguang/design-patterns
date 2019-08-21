package responsibility.a;

/**
 * @author leishiguang
 * date  2018/10/27 11:29
 * @version v1.0
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
