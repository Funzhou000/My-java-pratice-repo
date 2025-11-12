package D10;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        sc.close();
        // 定义三个计数器
        int bigCount = 0; // 大写字母计数
        int smallCount = 0; // 小写字母计数
        int numCount = 0; // 数字计数
        // 字符串遍历
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 判断字符类型
            if (c >= 'A' && c <= 'Z') {
                bigCount++; // 大写字母
            } else if (c >= 'a' && c <= 'z') {
                smallCount++; // 小写字母
            } else if (c >= '0' && c <= '9') {
                numCount++; // 数字这里是字符
            }
        }
        System.out.println("大写字母个数：" + bigCount +
                "\n小写字母个数：" + smallCount +
                "\n数字个数：" + numCount);
    }
}
