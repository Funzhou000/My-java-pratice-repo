package D6;

import java.util.Random;

public class copyadd {
    public static void main(String[] args) {
        int[] arr = new int[1_000_000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = r.nextInt(1_000_000);
            arr[i] = temp;
        } // 生成长度10000000的全随机数数组
          // 不要开那么大的数组,你电脑没那么多内存
        int[] fresharr = copyOfRange(arr, 5999, 6999);
        for (int i = 0; i < fresharr.length; i++) {
            System.out.print(fresharr[i]);
        }
    }

    public static int[] copyOfRange(int arr[], int from, int to) {
        int newLength = to - from;
        int[] fresh = new int[newLength];
        int j = 0;
        for (int i = from; i < to; i++) {
            fresh[j] = arr[i];
            j++;
        }
        return fresh;
    }
}
