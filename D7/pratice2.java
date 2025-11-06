package D7;

public class pratice2 {
    public static void main(String[] args) {
        int count = 0;
        for (int j = 100; j < 201; j++) {
            System.out.println(" " + isPrime(j) + "\t" + j);
            if (isPrime(j))
                count++;
        }
        System.out.println(count);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
