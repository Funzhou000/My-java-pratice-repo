package DataConstruture_algorithm.sort;

public class recursionTest {
    public static void main(String[] args) {
        System.out.println(method(100));
        System.out.println(factorial(5));
    }

    public static long factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int method(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + method(n - 1);
        }
    }
}
