package decorator.school;

/**
 * 美化（修饰）成绩单
 *
 * @author leishiguang
 * date  2018/10/30 20:52
 * @version v1.0
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    private void reportSort() {
        System.out.println("我是排名第38名");
    }
}
