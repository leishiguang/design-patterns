package com.ray.factory.simplify2;


/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {

    public static void main(String[] args) {
        CourseFacotry facotry = new CourseFacotry();
        ICourse course = facotry.create(JavaCourse.class);
        course.record();
        course = facotry.create(PythonCourse.class);
        course.record();
        ICourseFactory iCourseFactory = new JavaCourseFactory();
        course = iCourseFactory.create();
        course.record();
    }
}
