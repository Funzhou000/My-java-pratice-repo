package D10;

import java.util.Arrays;

public class StringDemo4 {
    public static void main(String[] args) {
        int[] arr = { 1, 24, 5, 6, };
        System.out.println(toStringDemo(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static String toStringDemo(int[] arr) {
        String result = "[";
        if (arr == null) {
            return "null";
        }
        if (arr.length == 0) {
            return "[]";
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i] + "]";
            } else {
                result += arr[i] + ", ";
            }
        }
        return result;
    }
}
