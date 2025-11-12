package D10;

public class StringDemo8 {
    public static void main(String[] args) {
        String id = "469002200511097119";
        String birth = id.substring(6, 14);
        char gender = id.charAt(16);// '3->3'
        // 用asii码值进行判断，奇数为男，偶数为女
        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("出生日期：" + birth + "，性别：女");
        } else {
            System.out.println("出生日期：" + birth + "，性别：男");
        }
    }
}
