package DataConstruture_algorithm.sort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 90, 34, 25, 12, 22, 11, 64 };
        for (int j = 0; j < arr.length - 1; j++) {// n-1轮
            for (int i = 0; i < arr.length - 1 - j; i++) {
                // 每轮如何比较数字并找到最大值
                // -1 防止越界
                // -j 每找到一个最大值 内层比较数字就可以少比较一个，
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
