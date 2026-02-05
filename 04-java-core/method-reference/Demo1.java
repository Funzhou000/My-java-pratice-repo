package DataConstruture_algorithm.MethodReference;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 5 };
        // Arrays.sort(arr, new Comparator<Integer>() {

        // @Override
        // public int compare(Integer o1, Integer o2) {
        // return o2 - o1;
        // }

        // });
        Arrays.sort(arr, Demo1::method);
        System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr, Demo1::method);
    }

    public static int method(Integer a, Integer b) {
        return b - a;
    }
}
