package com.ray.prototype.b;

import java.io.*;
import java.util.Date;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    public Object clone() {
        Object object = null;
        try {
            object = this.deepClone();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    /**
     * 深克隆，引用对象也重新克隆了
     */
    private Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        QiTianDaSheng copy = (QiTianDaSheng) ois.readObject();
        copy.birthday = new Date();
        return copy;
    }

    /**
     * 浅克隆，引用对象地址是一样的
     */
    public QiTianDaSheng shallowClone() {
        QiTianDaSheng clone = new QiTianDaSheng();
        clone.height = this.height;
        clone.weight = this.weight;
        clone.jinGuBang = this.jinGuBang;
        clone.birthday = new Date();
        return clone;
    }
}
