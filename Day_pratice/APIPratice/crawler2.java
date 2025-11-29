package APIPratice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class crawler2 {
    public static void main(String[] args) throws IOException {
        // String s = "abdfghjk" + "phone :19157346700" + "email: lifunzhou@gmail.com"
        // + "publicPhone:400-1234567,4001234567,400-123456,400345678";
        String regex1 = "(1[3-9]\\d{9})|(\\w+@\\w+(\\.\\w)+{1,})|(400-?\\\\d{3}-?\\\\d{4})";
        URL url = new URL("https://gemini.google.com/share/a372ae07860c");
        URLConnection conn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;

        while ((line = br.readLine()) != null) {
            Pattern p = Pattern.compile(regex1);
            Matcher m = p.matcher(line);
            while (m.find()) {
                String str = m.group();
                System.out.println(str);
            }

        }

        // while (m.find()) {
        // String str = m.group();
        // System.out.println(str);
        // }
        br.close();
    }
}
