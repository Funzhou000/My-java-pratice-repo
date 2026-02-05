package DataConstruture_algorithm.sort;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = { 9, 7, 6, 4, 3, 2, 1 };
        quickSorts(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSorts(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        // record range 查找的范围
        int start = left;
        int end = right;
        // pivot 基准值
        int pivot = arr[left];

        // 循环让比pivot小的值放到左边 比pivot大的值放到右边
        while (start != end) {
            // 用 end 指针从右向左找比pivot小的值 找到了就跳出循环等待 start 找到
            while (true) {
                if (end <= start || arr[end] < pivot) {
                    break;
                }
                end--;
            }
            // 用 start 指针从左向右找比pivot大的值 找到了就跳出循环
            while (true) {
                if (end <= start || arr[start] > pivot) {
                    break;
                }
                start++;
            }
            // 交换 start 和 end 指向的元素
            swap(arr, start, end);

        }
        // 交换 pivot 和 start 指向的元素
        swap(arr, left, start);
        // 递归处理左边的子数组

        quickSorts(arr, left, start - 1);
        // 递归处理右边的子数组
        quickSorts(arr, end + 1, right);
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
