package com.ray.decorator.school;

/**
 * 通过继承解决问题（区别于装饰者模式）
 *
 * @author leishiguang
 * date  2018/10/30 20:47
 * @version v1.0
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长：");
        System.out.println("  ..........");
        System.out.println(" 语文 62 数学 65 体育 98 自然 63");
        System.out.println(" ...........");
        System.out.println("                     家长签名：       ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为" + name);
    }
}
