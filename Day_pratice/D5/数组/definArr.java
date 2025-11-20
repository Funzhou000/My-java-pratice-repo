package D5.数组;

public class definArr {
    public static void main(String[] args) {
        // 静态定义数组
        int arr[] = { 1, 2, 3, 5 };
        // active arr
        int arractive[] = new int[3];
        // 直接用代表地址
        arractive[0] = 5;
        System.out.println(arr);// out xx@xxxxx

    }
}
