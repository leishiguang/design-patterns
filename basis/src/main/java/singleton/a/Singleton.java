package singleton.a;

/**
 * 单件模式
 *
 * @author leishiguang
 * date  2018/8/9 20:31
 * @version v1.0
 */
class Singleton {
    //private static Singleton uniqueInstance = new Singleton();
    private static Singleton uniqueInstance;

    private Singleton() {
    }

    /*public static Singleton getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }*/
    static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

}
