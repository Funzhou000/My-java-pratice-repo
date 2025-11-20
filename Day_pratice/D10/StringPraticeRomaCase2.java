package D10;

import java.util.Scanner;

public class StringPraticeRomaCase2 {
    public static void main(String[] args) {
        int number;
        int num;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.close();
        while (true) {
            num = number % 10;
            prinRoma(num);
            number = number / 10;
            if (number == 0) {
                break;
            }
        }

    }

    public static void prinRoma(int number) {

        String str = switch (number) {
            case 0 -> "";
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            default -> "输入错误";
        };
        System.out.printf(" " + str);
    }

}
