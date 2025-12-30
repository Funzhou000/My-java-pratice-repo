package DataConstruture_algorithm.Exception.ExceptionPratice1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GrilFriends gf = new GrilFriends();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("请输入女朋友的姓名：");
                String name = sc.nextLine();
                gf.setName(name);
                System.out.println("请输入女朋友的年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                System.out.println("女朋友的信息：");
                System.out.println("姓名：" + gf.getName());
                System.out.println("年龄：" + gf.getAge());
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的年龄格式不正确");
                e.printStackTrace();
            } catch (RuntimeException e) {
                System.out.println("输入的女朋友年龄和姓名不符合要求");
                e.printStackTrace();
            }

        }
    }
}