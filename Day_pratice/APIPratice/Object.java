package APIPratice;

public class Object {
    public static void main(String[] args) {
        // toString
        // equals
        // clonne
        // 了解 toString原本的方法
        // 重写 toString
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb.toString());
        testClass tc = new testClass(25, "funzhou");
        testClass tc2 = new testClass(25, "funzhou");
        System.out.println(tc.toString());
        // object 类的 equals 方法,默认比较的是地址值
        System.out.println(tc2.equals(tc));
        System.out.println(tc.equals(sb));
        // override equals 方法
    }
}
