package D4;

import java.util.Scanner;

public class rangejudge {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int count = 0;
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int i = start; i <= end; i++) {
                if (i % 3 == 0 && i % 6 == 0) {
                    count++;
                }
            }
            System.err.println(count);
        }
    }
}
