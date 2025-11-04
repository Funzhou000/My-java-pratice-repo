package D4.homework;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int firstInt = sc.nextInt();
            int secondInt = sc.nextInt();
            System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): ");
            int calculatType = sc.nextInt();
            switch (calculatType) {
                case 1 -> System.out.println(firstInt + secondInt);
                case 2 -> System.out.println(firstInt - secondInt);
                case 3 -> System.out.println(firstInt * secondInt);
                case 4 -> System.out.println(firstInt / (secondInt * 1.0));
                default -> System.out.println("wrong calucate type");
            }
        }
    }
}
