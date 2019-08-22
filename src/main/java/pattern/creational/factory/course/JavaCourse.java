package pattern.creational.factory.course;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class JavaCourse implements ICourse {
    /**
     * 录制视频
     */
    @Override
    public void record() {
        System.out.println("录制 Java 课程");
    }
}
