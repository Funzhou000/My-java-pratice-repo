package D6;

public class returnminimun {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 9, 7, 80, 756, 50, 152, 20 };
        System.out.println(findMax(arr));
    }

    public static int findMax(int arr[]) {
        int maximun = 0;
        int result;
        for (int i = 0; i < arr.length; i++) {
            if (maximun < arr[i])
                maximun = arr[i];
        }
        result = maximun;
        return result;
    }
}
