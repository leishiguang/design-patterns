package DecoratorPattern.SchoolReport;

/**
 * @author LeiShiGuang
 * Date  2018/10/30 20:49
 * @version v1.0
 */
public class Father {
    public static void main(String[] args) {
        //通过继承解决问题（区别于装饰者模式）
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        sr.report();

        //装饰者模式解决问题
        SchoolReport sr2;
        sr2 = new FouthGradeSchoolReport();
        sr2 = new HighScoreDecorator(sr2);
        sr2 = new SortDecorator(sr2);
        sr2.report();

    }
}
