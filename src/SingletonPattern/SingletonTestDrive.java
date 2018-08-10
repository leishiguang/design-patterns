package SingletonPattern;

/**
 * 单件模式测试
 *
 * @author LeiShiGuang
 * Date  2018/8/10 8:46
 * @version v1.0
 */
public class SingletonTestDrive {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("\n========= RunnableDemo =========");
        RunnableDemo R1 = new RunnableDemo("Runnable-1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo("Runnable-2");
        R2.start();
        //等待线程执行完...
        Thread.sleep(500);
        R1.getThread().join();
        R2.getThread().join();
        System.out.println("========= RunnableDemo END =========\n");

        System.out.println("\n========= ThreadDemo =========");
        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();
        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
        //等待线程执行完
        Thread.sleep(500);
        T1.getThread().join();
        T2.getThread().join();
        System.out.println("========= ThreadDemo END =========\n");

        System.out.println("\n========= ChocolateDemo =========");
        ChocolateDemo C1 = new ChocolateDemo("Boiler-1");
        C1.start();
        ChocolateDemo C2 = new ChocolateDemo("Boiler-2");
        C2.start();
        //等待线程执行完
        //Thread.sleep(2000);
        C1.getThread().join();
        C2.getThread().join();
        System.out.println("========= ChocolateDemo END =========\n");

        Singleton S1 = Singleton.getInstance();
        Singleton S2 = Singleton.getInstance();
        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());
    }
}

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    Thread getThread() {
        return t;
    }
}

class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(60);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    Thread getThread() {
        return t;
    }
}

class ChocolateDemo implements Runnable {
    private ChocolateBoiler chocolateBoiler;
    private Thread t;
    private String threadName;

    ChocolateDemo(String name) {
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            working();
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    void start() {
        System.out.println("Starting" + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    private void working() throws InterruptedException {
        if (chocolateBoiler == null) {
            chocolateBoiler = ChocolateBoiler.getInstance();
        }
        System.out.println(threadName + ": The Working ChocolateBoiler is " + chocolateBoiler.hashCode());
        Thread.sleep(30);
        chocolateBoiler.fill();
        Thread.sleep(50);
        chocolateBoiler.boil();
        Thread.sleep(40);
        chocolateBoiler.drain();

    }

    Thread getThread() {
        return t;
    }
}
