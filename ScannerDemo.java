import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] aStrings) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        System.out.println(i + x);
    }
}