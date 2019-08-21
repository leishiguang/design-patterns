package command.furniture;

/**
 * 产品
 *
 * @author leishiguang
 * date  2018/8/14 14:18
 * @version v1.0
 */
public class GarageDoor {
    private String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(name + ": GarageDoor is Up.");
    }

    public void down() {
        System.out.println(name + ": GarageDoor is Down.");
    }

    public void stop() {
        System.out.println(name + ": GarageDoor is Stop.");
    }

    public void lightOn() {
        System.out.println(name + ": GarageDoor is lightOn.");
    }

    public void lightOff() {
        System.out.println(name + ": GarageDoor is lightOff.");
    }

}
