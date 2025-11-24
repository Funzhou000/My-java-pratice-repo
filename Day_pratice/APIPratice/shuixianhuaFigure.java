package APIPratice;

public class shuixianhuaFigure {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            int ge = i % 10;
            int shi = (i / 10) % 10;
            // int bai = (i / 100) % 10;
            // int qian = (i / 1000) % 10;
            // int wan = (i / 10000) % 10;
            double sum = Math.pow(ge, 2) + Math.pow(shi, 2);

            if (sum == i) {
                System.out.println(i + "是水仙花数");
                count++;
            }

        }
        System.out.println("Total number of 水仙花数: " + count);
    }
}
