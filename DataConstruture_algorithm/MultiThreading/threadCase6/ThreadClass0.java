package DataConstruture_algorithm.MultiThreading.threadCase6;

public class ThreadClass0 extends Thread {
    static int index = 0;
    @Override
    public void run() {
        while(true){
            // keep the synchronized section as small as possible: only guard the shared counter
            synchronized(ThreadClass0.class){
                if(index<100){
                    System.out.println(Thread.currentThread().getName() + " " + index++);
                }else {
                    break;
                }
            }

            // sleep outside the synchronized block so the lock isn't held while sleeping.
            // This allows the other thread to acquire the lock and run concurrently.
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
