package template.course;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {

    public static void main(String[] args) {
        BaseNetworkCourse networkCourse = new JavaCourse();
        networkCourse.createCourese();

        BaseNetworkCourse bigDataCourese = new BigDataCourse();
        bigDataCourese.createCourese();
    }
}
