package DataConstruture_algorithm.Algorithm_CourseWork;

public class MonkyPeaches {
    public static void main(String[] args) {
        System.out.println(peach(1));
    }

    static int peach(int day) {
        if (day == 10) {
            return 1;
        } else {
            return (peach(day + 1) + 1) * 2;
        }
    }
}
