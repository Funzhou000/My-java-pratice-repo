package DataConstruture_algorithm.MultiThreading.ThreadPratic1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test1 {
    public static void main(String[] args) {
        TicketThread th1 = new TicketThread();
        TicketThread th2 = new TicketThread();
        th1.start();
        th2.start();


    }
}
