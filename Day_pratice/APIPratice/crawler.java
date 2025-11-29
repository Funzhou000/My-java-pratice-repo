package APIPratice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class crawler {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a][b-z]");
        Matcher m = p.matcher("ab");
        int count = 0;
        while (m.find()) {
            count++;
            System.out.println(m.group());
        }
        System.out.println("Total matches: " + count);
    }
}
