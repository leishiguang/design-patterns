package com.ray.template.course;

/**
 * 大数据课程
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class BigDataCourse extends BaseNetworkCourse {
    @Override
    void checkHomework() {
        System.out.println("检查大数据课程");
    }

    @Override
    protected boolean needHomework() {
        return true;
    }

}
