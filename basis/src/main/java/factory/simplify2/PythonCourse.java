package factory.simplify2;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class PythonCourse implements ICourse {
    /**
     * 录制视频
     */
    @Override
    public void record() {
        System.out.println("录制 Python 课程");
    }
}
