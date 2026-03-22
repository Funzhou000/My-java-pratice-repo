package DataConstruture_algorithm.MultiThreading.threadCase6;

public class Synchronized {
    public static void main(String[] args) {
        ThreadClass0 tc = new ThreadClass0();

        ThreadClass0 tc2 = new ThreadClass0();
        tc2.start();

        tc.start();
    }
}
