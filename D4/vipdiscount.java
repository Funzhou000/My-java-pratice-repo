package D4;

import java.util.Scanner;

public class vipdiscount {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            int vipGrade = sc.nextInt();
            switch (vipGrade) {
                case 1 -> System.out.println(1000 * 0.9);
                case 2 -> System.out.println(1000 * 0.9);
                case 3 -> System.out.println(1000 * 0.7);
                default -> System.out.println(1000);
            }
            // switch (vipGrade) {
            // case 1:
            // System.out.println(1000 * 0.9);
            // break;
            // case 2:
            // System.out.println(1000 * 0.8);
            // break;
            // case 3:
            // System.out.println(1000 * 0.7);
            // break;
            // default:
            // System.out.println(1000);
            // break;
        }
        // if (vipGrade == 1) {
        // System.out.println(1000 * 0.9);
        // } else if (vipGrade == 2) {
        // System.out.println(1000 * 0.8);
        // } else if (vipGrade == 3) {
        // System.out.println(1000 * 0.7);
        // } else {
        // System.out.println(1000);
        // }
    }

}
