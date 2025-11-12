package D10;

import java.util.Scanner;

public class Stringpratice {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        while (true) {

            str = sc.next();
            if (checkStr(str)) {
                // 罗马数字数组
                break;

            } else {
                System.out.println(" 请输入正确数字");
            }
        }
        sc.close();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int number = ch - 48; // 将字符转换为数字
            StringBuilder sb = new StringBuilder();
            sb.append(changeLuoMa(number));
            System.out.printf(" " + sb.toString());
        }

    }

    public static String changeLuoMa(int number) {
        String[] arr = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
                "X" };
        return arr[number];
    }

    public static boolean checkStr(String str) {
        if (str.length() > 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }
}
