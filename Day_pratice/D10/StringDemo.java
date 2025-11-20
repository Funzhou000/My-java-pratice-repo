package D10;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        String rightUsername = "admin";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if (password.equals(rightPassword) && username.equals(rightUsername)) {
                System.out.println("登录成功");
            } else {
                System.out.printf("登录失败,%s次机会", 2 - i);
            }
        }
        sc.close();
    }
}
