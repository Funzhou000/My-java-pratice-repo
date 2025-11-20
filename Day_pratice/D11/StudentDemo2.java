package D11;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StrudentClass> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            StrudentClass s = new StrudentClass();
            System.out.println("enter name");
            s.setName(sc.next());
            System.out.println("enter age");
            s.setAge(sc.nextInt());
            list.add(s);
            sc.close();
        }
        sc.close();
        System.out.println(list);// 当直接打印ArrayList时他会自动调用toString方法,当你的对象没有这个方法就只能返回地址值
        // String 自带toString所以能直接拼接
    }
}