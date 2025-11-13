package D11;

public class ClassrommPrat {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7, 8 };
        System.out.println(search(arr, 7));
    }

    public static int search(int arr[], int k) {
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (k == arr[mid]) {
                return mid;
            } else if (k < arr[mid]) {
                high = mid - 1;
            } else if (k > arr[mid]) {
                low = mid + 1;
            }
        }
        return 0;
    }
}
