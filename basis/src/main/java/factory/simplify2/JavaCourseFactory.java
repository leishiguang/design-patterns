package factory.simplify2;

/**
 * 方法2：专门的工厂类
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
