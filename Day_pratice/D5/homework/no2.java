package D5.homework;

public class no2 {
    public static void main(String[] args) {
        double arr[] = { 12.9, 53.54, 75.0, 99.1, 3.14 };
        double mini = 1000000;
        for (int i = 0; i < arr.length; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
            }
        }
        System.out.println(mini);
    }

}
