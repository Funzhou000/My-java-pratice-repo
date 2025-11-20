package D6;

public class method1 {
    public static void main(String[] args) {
        int arr[] = { 1, 5, 6, 7, 8, 9, 10 };
        prinarr(arr);
    }

    public static void prinarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

}
