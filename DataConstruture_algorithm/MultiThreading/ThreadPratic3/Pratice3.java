package DataConstruture_algorithm.MultiThreading.ThreadPratic3;

public class Pratice3 extends Thread {
    static int count = 100;
    static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (count <= 10) {
                   break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余票数：" + --count);
                }
            }
        }
    }
}
