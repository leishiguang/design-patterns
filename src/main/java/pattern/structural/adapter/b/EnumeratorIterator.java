package pattern.structural.adapter.b;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 将枚举接口 Enumeration 适配成迭代器 Iterator
 *
 * @author leishiguang
 * date  2018/10/19 10:16
 * @version v1.0
 */
public class EnumeratorIterator implements Iterator {

    Enumeration enumeration;

    public EnumeratorIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException();
    }
}
