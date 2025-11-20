public class thirdnariy2 {
    public static void main(String[] args) {
        short high1 = 150;
        short high2 = 165;
        short high3 = 210;
        int temp = high1 > high2 ? high1 : high2;
        int result = temp > high3 ? temp : high3;
        System.out.println(result);
    }
}
