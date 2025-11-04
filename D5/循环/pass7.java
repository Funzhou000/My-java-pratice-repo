package D5.循环;

public class pass7 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {

            int ge = i % 10;
            int shi = i / 10 % 10;
            if (ge == 7 || shi == 7 || i % 7 == 0)
                System.out.println(i + "pass");
        }
    }
}
