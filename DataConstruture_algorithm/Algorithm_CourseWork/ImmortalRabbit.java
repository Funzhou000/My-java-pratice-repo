package DataConstruture_algorithm.Algorithm_CourseWork;

public class ImmortalRabbit {
    public static void main(String[] args) {
        System.out.println(rabbit(12));
    }

    static int rabbit(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return rabbit(n - 1) + rabbit(n - 2);
        }
    }
}
