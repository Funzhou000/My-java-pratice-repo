package D10;

import java.util.Random;

public class StringDemom12 {
    public static void main(String[] args) {
        String s = "23";
        String s2 = "643";
        // System.out.println(shuffleStringArray(s.toCharArray()));//char数组可以直接打印,
        // 系统自动拼接
        System.out.println(transferFromStringToInt(shuffleStringArray(s.toCharArray()))
                * transferFromStringToInt(shuffleStringArray(s2.toCharArray())));
    }
    // 给定两个只有数字的字符串,打印他们两个的打乱过的整数,再将两个整数相加并打印结果

    public static int transferFromStringToInt(char arr[]) {
        // char arr[] = str.toCharArray();
        int result = 0;
        for (int i = arr.length; i >= 1; i--) {
            int number = arr[i - 1] - '0';
            result += number * Math.pow(10, i - 1);
        }

        return result;
    }

    public static String shuffleArray(char[] arr) {
        boolean remArr[] = new boolean[arr.length];// 记录被选中过的索引
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < arr.length;) {

            int index = r.nextInt(arr.length);// index为随机数

            if (!remArr[index]) {
                sb.append(arr[index]);
                System.out.println(sb.toString());
                remArr[index] = true;
                i++;
            }

        }
        return sb.toString();
    }

    public static char[] shuffleStringArray(char str[]) {
        // 倒叙,从arr[arr.length()-1]开始,每一次选一个范围(索引0-i)将当前索引的值和随机索引的值交换
        Random r = new Random();
        for (int i = str.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        System.out.println(str);
        return str;
    }
}
