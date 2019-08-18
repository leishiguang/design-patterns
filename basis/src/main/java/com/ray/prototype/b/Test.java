package com.ray.prototype.b;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
        System.out.println("深克隆：" + (System.identityHashCode(qiTianDaSheng.jinGuBang) == System.identityHashCode(clone.jinGuBang)));

        QiTianDaSheng shallowClone = qiTianDaSheng.shallowClone();
        System.out.println("浅克隆：" + (System.identityHashCode(qiTianDaSheng.jinGuBang) == System.identityHashCode(shallowClone.jinGuBang)));
    }
}
