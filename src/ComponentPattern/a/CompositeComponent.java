package ComponentPattern.a;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 菜单节点
 *
 * @author LeiShiGuang
 * Date  2018/10/26 22:47
 * @version v1.0
 */
public class CompositeComponent extends BaseComponent {

    private ArrayList<BaseComponent> compositeList = new ArrayList<>();
    private String compositeName;

    public CompositeComponent(String compositeName) {
        this.compositeName = compositeName;
    }

    @Override
    public Iterator createIterator() {
        return compositeList.iterator();
    }

    @Override
    public void add(BaseComponent component) {
        compositeList.add(component);
    }

    @Override
    public void remove(BaseComponent component) {
        compositeList.remove(component);
    }

    @Override
    public BaseComponent getChild(int i) {
        return compositeList.get(i);
    }

    @Override
    public String getName() {
        return compositeName;
    }

    @Override
    public void print() {
        System.out.println("Composite:" + compositeName);
        for (BaseComponent component : compositeList) {
            component.print();
        }
    }
}
