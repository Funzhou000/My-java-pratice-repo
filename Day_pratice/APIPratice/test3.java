package APIPratice;

public class test3 {
    public static void main(String[] args) {
        Integer number = 12345;
        System.out.println(Integer.toBinaryString(number));
        StringBuilder sb = new StringBuilder();
        while (number != 0) {
            Integer temp = number % 2;
            sb.insert(0, temp);
            number /= 2;
        }
        System.out.println(sb);
    }
}
