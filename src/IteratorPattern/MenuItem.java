package IteratorPattern;

/**
 * 菜单
 *
 * @author LeiShiGuang
 * Date  2018/10/22 21:55
 * @version v1.0
 */
public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double prive;

    public MenuItem(String name, String description, boolean vegetarian, double prive) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.prive = prive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public double getPrive() {
        return prive;
    }

    public void setPrive(double prive) {
        this.prive = prive;
    }
}
