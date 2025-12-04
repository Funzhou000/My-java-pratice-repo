package DataConstruture_algorithm.sort;

public class selectSort {
    public static void main(String[] args) {
        int[] arr = { 90, 34, 25, 12, 22, 11, 64 };
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                // 0索引与后面的元素比较 找到最小值
                if (arr[j] > arr[i]) {
                    swap(arr, j, i);
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