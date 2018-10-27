package ChainOfResponsibilityPattern.a;

/**
 * @author LeiShiGuang
 * Date  2018/10/27 11:30
 * @version v1.0
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
