package DataConstruture_algorithm.MultiThreading.threadCase3;

import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) {
        ThreadCase3 threadCase3 = new ThreadCase3();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(threadCase3);
        Thread thread = new Thread(futureTask);
        thread.start();

    }
}
