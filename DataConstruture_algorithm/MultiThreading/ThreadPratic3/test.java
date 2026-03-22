package DataConstruture_algorithm.MultiThreading.ThreadPratic3;

public class test {
    public static void main(String[] args) {
        Pratice3 t1 = new Pratice3();
        Pratice3 t2 = new Pratice3();
        Pratice3 t3 = new Pratice3();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
