package ComponentPattern;

import IteratorPattern.NullIterator;

import java.util.Iterator;

/**
 * 叶子节点
 *
 * @author LeiShiGuang
 * Date  2018/10/26 22:47
 * @version v1.0
 */
public class LeefComponent extends BaseComponent {

    private String leefName;

    public LeefComponent(String leefName) {
        this.leefName = leefName;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public String getName() {
        return leefName;
    }

    @Override
    public void print() {
        System.out.println("\tLeef:" + leefName);
    }
}
