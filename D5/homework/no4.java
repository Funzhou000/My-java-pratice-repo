package D5.homework;

public class no4 {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 5, 4 };
        long sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i] * (Math.pow(10, i));
        }
        System.out.println(sum);
    }
}
