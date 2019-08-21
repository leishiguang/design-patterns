package decorator.school;

/**
 * TODO(用一句话描述该文件做什么)
 *
 * @author leishiguang
 * date  2018/10/30 20:58
 * @version v1.0
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }
}
