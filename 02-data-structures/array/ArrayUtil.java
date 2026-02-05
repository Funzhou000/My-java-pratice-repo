package Adv_OOP.Demo2;

//工具类练习
public class ArrayUtil {
    // 私有化构造为了不让外界创建他的对象
    private ArrayUtil() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static double average(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    // 定义静态方法
    public static String prinArr(int arr[]) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]);
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
