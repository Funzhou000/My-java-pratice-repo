package D5.循环;

public class isPrime {
    public static void main(String[] args) {
        int number = 7;
        boolean judge = true;// number can be replaced sqrt(number)
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                judge = false;
                break;
            }
            ;
        }
        System.out.println(judge);
    }
}
