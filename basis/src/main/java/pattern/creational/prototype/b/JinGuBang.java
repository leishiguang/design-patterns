package pattern.creational.prototype.b;

import java.io.Serializable;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big() {
        this.d *= 2;
        this.h *= 2;
    }

    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
