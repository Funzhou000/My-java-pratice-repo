package DataConstruture_algorithm.MultiThreading.ThreadPratic2;

public class test {
    public static void main(String[] args) {
        InterThreadCommunication th1 = new InterThreadCommunication();
        InterThreadCommunication th2 = new InterThreadCommunication();
        th1.start();
        th2.start();
    }
}
