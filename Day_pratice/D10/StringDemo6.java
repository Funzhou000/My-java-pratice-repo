package D10;

import java.util.Scanner;

public class StringDemo6 {
    // 金额转换
    public static void main(String[] args) {
        int money = inputMoney();
        System.out.println(money);
        System.out.println(convertMoneyToChinese(money));
    }

    public static String convertMoneyToChinese(int money) {

        // 拆解数字
        String result = "";
        String[] bigChar = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        while (true) {
            int ge = money % 10;
            // 字符串提取根据每一位数
            result = bigChar[ge] + result;
            money /= 10;
            if (money == 0) {
                break;
            }
        } // 此处已经拆解成大写单个数字
          // 接下来补0
          // for (int i = 0; i < 7-result.length(); i++) {
          // result = "0" + result;
          // }//此处补齐了0
          // 补单位
        String[] danwei = { "元", "拾", "佰", "仟", "万", "拾万", "佰万" };
        // 用charAt用索引返回字符,再用字符拼接单位
        String finalResult = "";
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            finalResult = finalResult + c + danwei[result.length() - 1 - i];
            // hardpart

            // 拆解的数字提取大写//a = a+b
            // 拼接成没有0 只有翻译的版本
            // 加0
            // insert danwei

        }
        return finalResult;

    }

    public static int inputMoney() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");

        while (true) {
            int money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                System.out.println("输入成功  ");
                sc.close();
                return money;
            } else {
                System.out.println("输入金额不合法");
            }
        }
    }
    // 提取每一位数
    // 把每一位数当作索引找大写金额(查表法)
}
