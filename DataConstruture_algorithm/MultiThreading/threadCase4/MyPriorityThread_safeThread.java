package DataConstruture_algorithm.MultiThreading.threadCase4;

public class MyPriorityThread_safeThread {
    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass();
        Thread t1 = new Thread(tc);
        System.out.println(t1.getPriority());
        t1.start();
        System.out.println("===============");
        ThreadClass tc2 = new ThreadClass();
        tc2.setPriority(10);
        tc2.start();
        ThreadClass tc3 = new ThreadClass();
        tc3.setDaemon(true);
        tc3.start();
        //守护线程会在其他所有（用户线程）线程结束后自动结束

    }
}
