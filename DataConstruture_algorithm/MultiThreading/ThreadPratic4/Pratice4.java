package DataConstruture_algorithm.MultiThreading.ThreadPratic4;

public class Pratice4 extends Thread {
    static int count = 1;
    static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (count ==100) {
                    break;
                }

                if (count%2!=0) {
                    System.out.println(getName() + "：奇数 " + count);

                }
                count++;
            }
        }
    }
}
