package DataConstruture_algorithm.MultiThreading.ThreadPratic2;

public class InterThreadCommunication extends Thread {
    static int ticket=0;
    static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                lock.notify();
                if (ticket >= 100) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " 卖出了：" + ticket++);
                try {
                    lock.wait();//买完一张牌你释放当前线程的锁，让当前线程等待
                    //另一个被唤醒的线程拿到锁继续买票
                    //实现类交替卖票
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
