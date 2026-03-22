package DataConstruture_algorithm.MultiThreading.threadCase5;

public class pilotThread_CutInThread {
    public static void main(String[] args) {
        ThreadClass tc = new ThreadClass();
        tc.start();

        ThreadClass tc2 = new ThreadClass();
        tc2.start();

    }
}
