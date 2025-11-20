package D4;

public class flodCountAnalysis {
    public static void main(String[] args) {
        double high = 0.1;
        int count = 0;
        while (high < 8844430) {
            high *= 2;
            count++;
        }
        System.out.println(count);
    }
}
