package APIPratice;

public class isprime {
    public static void main(String[] args) {
        int num = 57;
        boolean isPrime = true;
        int divisor = -1;
        int y = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                divisor = i;
                y = num / i;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number." + divisor + " and " + y + " are its factors.");
        }
    }
}
