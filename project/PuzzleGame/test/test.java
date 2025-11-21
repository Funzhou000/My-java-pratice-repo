package project.PuzzleGame.test;

import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        Random r = new Random();
        int temp;

        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(arr.length);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
