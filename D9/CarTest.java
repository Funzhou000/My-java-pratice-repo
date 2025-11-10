package D9;

import java.util.Arrays;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car r = new Car();
            System.out.println("set car brand");
            String brand = sc.next();
            r.setBrand(brand);
            System.out.println("set car color ");
            String color = sc.next();
            r.setColor(color);
            System.out.println("set car price");
            int price = sc.nextInt();
            r.setPrice(price);
            arr[i] = r;
        }
        sc.close();
        System.out.println(Arrays.toString(arr));
    }
}
