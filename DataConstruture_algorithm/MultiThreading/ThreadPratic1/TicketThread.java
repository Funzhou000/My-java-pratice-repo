package DataConstruture_algorithm.MultiThreading.ThreadPratic1;

public class TicketThread extends Thread {
    static int ticket = 1;
    //定义一个 static 的锁对象，确保所有线程实例共享一把锁
    static final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (ticket >1000) {
                    break;
                }
                try {
                    Thread.sleep(1); // 模拟出票时间
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " 卖出了一张票，剩余票数：" + (1000 - ticket));
                ticket++;
            }
        }
    }
}
