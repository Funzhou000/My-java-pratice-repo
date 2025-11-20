package D4;

import java.util.Scanner;

public class loppingLeetcode {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int number = sc.nextInt();
            int temp = number;
            int num = 0;
            while (number != 0) {
                int ge = number % 10;
                number /= 10;
                num = num * 10 + ge;
            }
            if (temp == num)
                System.out.println("是回文数");
            else
                System.out.println("不是回文数");
        }
    }
}
