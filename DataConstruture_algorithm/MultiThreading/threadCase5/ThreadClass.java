package DataConstruture_algorithm.MultiThreading.threadCase5;

public class ThreadClass extends Thread {
    @Override
    public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
                Thread.yield();
            }
    }
}
