package DataConstruture_algorithm.Algorithm_CourseWork;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(20));
    }

    static int climbStairs(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return climbStairs(i - 1) + climbStairs(i - 2);
    }
}
