package proxy.c;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Father implements Person {

    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("父亲提要求...");
        son.findLove();
        System.out.println("双方同意交往，确定关系...");
    }
}
