package DataConstruture_algorithm.MultiThreading.ThreadPratic4;

public class test {
    public static void main(String[] args) {
        Pratice4 t1 = new Pratice4();
        Pratice4 t2 = new Pratice4();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
