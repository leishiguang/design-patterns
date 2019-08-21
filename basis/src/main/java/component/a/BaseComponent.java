package component.a;

import java.util.Iterator;

/**
 * @author leishiguang
 * date  2018/10/26 22:47
 * @version v1.0
 */
public abstract class BaseComponent {

    public abstract Iterator createIterator();

    public void add(BaseComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(BaseComponent component) {
        throw new UnsupportedOperationException();
    }

    public BaseComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }


}
