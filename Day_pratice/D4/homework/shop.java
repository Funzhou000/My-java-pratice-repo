package D4.homework;
// 某商场购物可以打折，具体规则如下：

import java.util.Scanner;

// ​ 普通顾客购不满100元不打折，满100元打9折；

// ​ 会员购物不满200元打8折，满200元打7.5折；

// ​ 不同打折规则不累加计算。

// 请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）
// 和购物的折前金额（整数即可），输出应付金额（小数类型）。

public class shop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            int coustomerType = sc.nextInt();
            int bill = sc.nextInt();
            if (coustomerType == 0) {
                System.out.println("you arn't our vip, you should pay " + (bill > 100 ? bill *= 0.9 : bill));
            } else if (coustomerType == 1) {
                System.out.println("you are our vip, you should pay " + (bill > 200 ? bill *= 0.8 : (bill *= 0.75)));
            } else
                System.out.println("wrong coustomer code!");
        }

    }

}
