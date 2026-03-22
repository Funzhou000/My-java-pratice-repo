package DataConstruture_algorithm.MultiThreading.threadCase1;

public class ThreadDemo {
    public static void main(String[] args) {
        //继承thread 类的实现方式
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread.setName("Thread1");
        myThread2.setName("Thread2");
        myThread.start();
        myThread2.start();
    }
}
