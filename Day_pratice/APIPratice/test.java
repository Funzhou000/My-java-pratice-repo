package APIPratice;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数，输入-1结束：");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            if (num == -1) {
                System.out.println("范围错误");
            }
            list.add(num);// auto-boxing
            sum += num;
            if (sum >= 200) {
                break;
            }
        }
        System.out.println("sum=" + sum);
        sc.close();
    }
}
