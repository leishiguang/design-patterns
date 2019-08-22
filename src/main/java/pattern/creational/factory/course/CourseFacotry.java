package pattern.creational.factory.course;


/**
 * 方法1：简单工厂，通用的
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
class CourseFacotry {

    ICourse create(Class<? extends ICourse> clazz) {
        try {
            if (null != clazz) {
                return clazz.newInstance();
            }
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
