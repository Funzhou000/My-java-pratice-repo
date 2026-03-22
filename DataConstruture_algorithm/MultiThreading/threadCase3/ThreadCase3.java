package DataConstruture_algorithm.MultiThreading.threadCase3;

import java.util.concurrent.Callable;

public class ThreadCase3 implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);

        }

        return 0;
    }
}
