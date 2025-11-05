package D6;

public class resist {
    public static boolean findfigure(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 9, 7, 8, 9, 1, 10 };
        if (findfigure(arr, 5)) {
            System.out.println("有这个数");
        } else
            System.out.println("无");
    }
}
