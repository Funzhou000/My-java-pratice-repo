package D7;

import java.util.Arrays;
import java.util.Scanner;

public class pratice6 {
    public static void main(String[] args) {
        // 得到每位数并加5/n%10^n-这里从各位开始处理
        // 反转数字,从个位开始放入数组的第一个位置
        // 拼接,数组第一位*10^arr.length
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        encryptData(number);
    }

    public static void encryptData(int number) {
        int[] array = dataProcess(number);
        String num = "";
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            num += array[i];
        }
        System.out.println(num);
    }

    public static int[] dataProcess(int number) {
        int num = judge(number);// 记录几位数
        int[] array = new int[num];// expect int
        for (int n = 0; n < num; n++) {
            // 1. 提取当前位数字 (Get the digit)
            // 对 10 取模得到当前（最右边）的数字
            int digit = number % 10;

            array[n] = (digit + 5) % 10;

            // 2. 准备下一轮循环 (Prepare for the next iteration)
            // 对 10 进行整数除法，将当前位移除
            number = number / 10;
        }
        return array;
    }

    public static int judge(int nummber) {
        int count = 0;
        while (nummber != 0) {
            nummber /= 10;
            count++;
        }
        return count;
    }
}
