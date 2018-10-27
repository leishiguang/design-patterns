package ChainOfResponsibilityPattern.a;

/**
 * @author LeiShiGuang
 * Date  2018/10/27 11:32
 * @version v1.0
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
