package DataConstruture_algorithm.MultiThreading.threadCase2;

public class TreadCase2 {
    public static void main(String[] args) {
        //实现 Runnable 接口的方式
        MyThread2 myThread2 = new MyThread2();
        Thread t1 = new Thread(myThread2);
        Thread t2 = new Thread(myThread2);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
