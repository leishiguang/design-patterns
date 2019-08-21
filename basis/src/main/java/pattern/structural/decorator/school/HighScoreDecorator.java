package pattern.structural.decorator.school;

/**
 * @author leishiguang
 * date  2018/10/30 20:57
 * @version v1.0
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
}
