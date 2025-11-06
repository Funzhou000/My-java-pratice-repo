package D6.D6homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class homework1 {
    public static void main(String[] urgs) {
        int[] prizePool = { 2, 588, 888, 1000, 10000 };
        bigprize(prizePool);

    }

    public static void bigprize(int arr[]) {
        // 1转换成动态数组
        // 每次用随机数弹出数组的一个数据
        // 随机数的生成范围要不断调整0-arr.length
        ArrayList<Integer> smartIntArray = (ArrayList<Integer>) Arrays.stream(arr)
                .boxed() // 必须：将 int 转换为 Integer
                .collect(Collectors.toList());
        // 生成随机数
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int randomIndex = r.nextInt(smartIntArray.size());// 以剩下的奖为范围生成随机数
            System.out.println(smartIntArray.remove(randomIndex));
        }
    }

    public static int[] copyOf(int[] arr, int newLength) {
        int[] arr2 = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static void fill9(int[] arr, int fromIndex, int toIndex, int value) {
        for (int i = fromIndex; i <= toIndex; i++) {
            arr[i] = value;
        }
    }

    public static void fill8(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }

    public static boolean arrfigure(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr1[i] != arr2[i])
                    continue;
                else
                    return true;
            }
        }
        return false;
    }

    public static int calnumber(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10;
            count++;
        }
        return count;
    }
}
