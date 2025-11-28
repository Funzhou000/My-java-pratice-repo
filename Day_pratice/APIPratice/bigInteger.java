package APIPratice;

import java.math.BigInteger;
import java.util.Random;

public class bigInteger {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("12345678901234567890");
        BigInteger big2 = new BigInteger("98765432109876543210", 10);
        BigInteger big3 = new BigInteger(3, new Random());
        BigInteger big4 = BigInteger.valueOf(16);
        BigInteger big5 = BigInteger.valueOf(16);
        BigInteger big6 = big.add(big2);
        System.out.println("big: " + big6);
        BigInteger big7 = big.subtract(big2);
        System.out.println("big2: " + big7);
        BigInteger big8 = big.multiply(big2);
        System.out.println("big3: " + big8);
        BigInteger big9 = big.divide(big2);
        System.out.println("big4: " + big9);
        BigInteger[] big10 = big.divideAndRemainder(big2);
        System.out.println("big5: " + big10[0] + " 余数: " + big10[1]);
        System.out.println(big4.equals(big5));
        System.out.println(big.pow(1));
        System.out.println(big.max(big2));
        System.out.println(big.min(big2));
        System.out.println(big3.intValue());

    }
}
