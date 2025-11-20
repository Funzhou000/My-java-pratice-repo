package D6;

public class methodpra {
    public static void main(String[] args) {
        int number = 100;
        int[] arr = { 100 };
        method1(number);
        method2(arr);
        System.out.println(number);
        System.out.println(arr[0]);
    }

    public static void method1(int number) {
        number = 1;
    }

    public static void method2(int arr[]) {
        arr[0] = 5;
    }
}
