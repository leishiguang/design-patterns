package com.ray.singleton.a;

/**
 * 单件模式：巧克力工厂
 *
 * @author leishiguang
 * date  2018/8/9 20:37
 * @version v1.0
 */
class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    /**
     * 实例化单例ChocolateBoiler
     */
    static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            // 防止多线程操作时，生成不同的 object
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    try { // for debugger: 测试线程安全，如果不加同步，则会生成不同的实例...
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    void fill() {
        if (isEmpty()) {
            //在锅炉内填满巧克力和牛奶的混合物
            empty = false;
            boiled = false;
            System.out.println("ChocolateBoiler is Filled...");
        }
    }

    void drain() {
        if (!isEmpty() && isBoiled()) {
            // 排出煮沸的巧克力和牛奶
            empty = true;
            System.out.println("ChocolateBoiler is Drained...");
        }
    }

    void boil() {
        if (!isEmpty() && !isBoiled()) {
            // 将炉内物煮沸
            boiled = true;
            System.out.println("ChocolateBoiler is Boiled...");
        }
    }

    private boolean isEmpty() {
        return empty;
    }

    private boolean isBoiled() {
        return boiled;
    }
}
