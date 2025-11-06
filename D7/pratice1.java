package D7;

import java.util.Scanner;

public class pratice1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("month");
            int month = sc.nextInt();
            System.out.println("price");
            int price = sc.nextInt();
            System.out.println("clas");
            int clas = sc.nextInt();
            System.out.println(priceCal(month, price, clas));
        }
    }

    public static int priceCal(int month, int price, int clas) {
        if (month >= 5 && month <= 10)
            return getprice(price, clas, 0.9, 0.85);
        // if (clas == 0) {
        // price *= 0.9;
        // } else {
        // price *= 0.85;
        // }
        else if (month >= 1 && month <= 4 || month >= 11 && month <= 12)
            return getprice(price, clas, 0.7, 0.65);
        else
            System.out.println("wrong input");
        return 0;

    }

    public static int getprice(int price, int clas, double x, double y) {
        if (clas == 0)
            price *= x;
        else
            price *= y;
        return price;
    }
}
