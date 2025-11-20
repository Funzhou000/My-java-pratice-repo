package D10;

public class StringDemo10 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append(2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb);
        System.out.println(sb.toString());
    }
}
