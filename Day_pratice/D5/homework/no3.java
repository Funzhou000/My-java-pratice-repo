package D5.homework;

import java.util.Random;

public class no3 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = r.nextInt(100);
            arr[i] = randomNumber;
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

    }
}
