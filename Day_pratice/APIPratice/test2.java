package APIPratice;

public class test2 {
    public static void main(String[] args) {
        // imple parseint
        String str = "12345";
        // use regex to check if str is a valid integer
        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("范围错误");
        } else {
            int number = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int digit = c - '0';
                number = number * 10 + digit;
            }
            System.out.println("number=" + (number + 1));
        }

    }
}
