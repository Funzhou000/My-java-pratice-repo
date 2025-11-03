package D4;

import java.util.Scanner;

//qu0tinent商 remainder余数
public class Divisionleetcode {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int divident = sc.nextInt();
            int divisor = sc.nextInt();
            int quotinent = 0;
            // int remainder = 0;
            while (divident >= divisor) {
                divident -= divisor;
                quotinent++;
            }
            // while (divident > 0) {
            // divident -= divisor;
            // if (divident >= 0)
            // quotinent++;
            // if (divident - divisor < 0 && divident > 0)
            // remainder = divident;
            // }
            System.out.println(quotinent);
            System.out.println(divident);
            // System.out.println(remainder);
        }
    }
}
