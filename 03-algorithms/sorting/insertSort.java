package DataConstruture_algorithm.sort;

public class insertSort {
    public static void main(String[] args) {
        // find 无序组的开始索引
        int[] arr = { 34, 90, 25, 12, 22, 11, 64 };
        int startIndex = findStartIndex(arr);
        // insert form startIndex to end
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {// 从左到右允许，如果arr[j] < arr[j - 1]写在前面会出现数组越界问题
                swap(arr, j, j - 1);
                j--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findStartIndex(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return i + 1;
            }
        }
        return -1;
    }
}
