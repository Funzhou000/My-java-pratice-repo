package D4.homework;

import java.util.Scanner;

public class minimun {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int temp = a > b ? b : a;
            System.out.println(temp > c ? c : temp);
        }
    }
}
