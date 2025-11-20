package D7;

import java.util.Random;

public class pratice3 {
    public static void main(String[] args) {
        System.out.println(generateCaptcha());
    }

    public static String generateCaptcha() {
        String result = "";
        char[] charatorsArr = charatorGenerator();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(charatorsArr.length);
            result += charatorsArr[index];
        }
        int number = r.nextInt(10);
        return result += number;
    }

    public static char[] charatorGenerator() {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            // add mini charators
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            } else {
                // add large charators
                chs[i] = (char) (65 + i - 26);
            }
        }
        return chs;
    }
}
