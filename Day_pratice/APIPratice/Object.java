package APIPratice;

import java.util.Objects;

public class Object implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        // toString
        // equals
        // clonne
        // 了解 toString原本的方法
        // 重写 toString
        int[] arr = { 1, 2, 3, 4, 5 };
        testClass t = new testClass(18, "fun", arr);
        // testClass t3 = new testClass(18, "fun", arr);
        testClass t2 = (testClass) t.clone();
        arr[0] = 0;
        boolean isEqual = Objects.equals(t, t2);
        System.out.println("t 和 t2 是否相等: " + isEqual);

        System.out.println(java.util.Arrays.toString(t2.data));
    }

}
