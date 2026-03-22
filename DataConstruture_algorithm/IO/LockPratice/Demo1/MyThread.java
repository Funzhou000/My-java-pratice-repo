package DataConstruture_algorithm.IO.LockPratice.Demo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    int ticket;
    static Lock lock = new ReentrantLock();
    public void run() {
        while(true){
            try {
                lock.lock();
                if(ticket==100){
                    break;
                }else {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(Thread.currentThread().getName()+"卖了第"+ticket+"张票");
                }
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
    }
}
