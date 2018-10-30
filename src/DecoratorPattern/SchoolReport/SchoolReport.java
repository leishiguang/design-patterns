package DecoratorPattern.SchoolReport;

/**
 * @author LeiShiGuang
 * Date  2018/10/30 20:45
 * @version v1.0
 */
public abstract class SchoolReport {
    /**
     * 展示成绩
     */
    public abstract void report();

    /**
     * 要求签名
     */
    public abstract void sign(String name);
}