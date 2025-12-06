package DataConstruture_algorithm;

import java.util.Arrays;

public class ArraysPratice {
    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 4, 3, 5 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 4));
        // search inexist figure will return (figure) -1
        System.out.println(Arrays.binarySearch(arr, 0));
        Integer[] arr2 = Arrays.copyOf(arr, 10);// other positon default fill null
        System.out.println(Arrays.toString(arr2));
        Integer[] arr3 = Arrays.copyOfRange(arr, 1, 4);// [1,4)
        System.out.println(Arrays.toString(arr3));// [2,4,3]
        Arrays.fill(arr3, 8);
        System.out.println(Arrays.toString(arr3));// [8,8,8]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Integer[] arx = { 1, 2, 4, 3, 6, 777, 876, 967856, 23, 5456, 57 };
        Arrays.sort(arx, new java.util.Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == null && o2 == null)
                    return 0;
                if (o1 == null)
                    return 1;
                if (o2 == null)
                    return -1;
                return o2 - o1;
            }
        });

    }
}
