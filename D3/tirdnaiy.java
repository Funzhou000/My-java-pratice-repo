import java.util.Scanner;

public class tirdnaiy {
    public void main(String[] arges) {
        Scanner sc = new Scanner(System.in);
        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();
        sc.close();
        String result = weight1 == weight2 ? "same" : "different";
        System.out.println(result);

    }
}
