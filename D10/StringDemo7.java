package D10;

public class StringDemo7 {
    public static void main(String[] args) {
        String phoneNumber = "18786447705";
        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(7);
        System.out.println(start + "*****" + end);
    }
}
