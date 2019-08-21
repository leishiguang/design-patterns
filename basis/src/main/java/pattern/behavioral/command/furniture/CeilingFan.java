package pattern.behavioral.command.furniture;

/**
 * 产品
 *
 * @author leishiguang
 * date  2018/8/14 14:17
 * @version v1.0
 */
public class CeilingFan {
    private String name;
    private String speed;

    public CeilingFan(String name) {
        this.name = name;
    }

    public void high() {
        speed = "high";
        System.out.println(name + ": CeilingFan is working on High Level.");
    }

    public void medium() {
        speed = "medium";
        System.out.println(name + ": CeilingFan is working on Medium Level.");
    }

    public void low() {
        speed = "low";
        System.out.println(name + ": CeilingFan is working on Low Level.");
    }

    public void off() {
        System.out.println(name + ": CeilingFan is Off.");
    }

    public void getSpeed() {
        System.out.println(name + ": CeilingFan's speed is " + speed);
    }
}
