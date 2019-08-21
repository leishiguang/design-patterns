package com.ray.template.course;

/**
 * 模板方法会有一个或多个未实现的方法
 *
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public abstract class BaseNetworkCourse {

    protected final void createCourese() {
        this.postPreResource();
        this.createPpt();
        if (needHomework()) {
            checkHomework();
        }
    }

    abstract void checkHomework();

    /**
     * 钩子方法，实现流程的微调
     */
    protected boolean needHomework() {
        return false;
    }

    protected void createPpt() {
        System.out.println("发放ppt");
    }

    protected void postPreResource() {
        System.out.println("发送预习资料");
    }
}
