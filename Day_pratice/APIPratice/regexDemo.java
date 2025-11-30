package APIPratice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo {
    public static void main(String[] args) {
        // String s = "javA is a programming language. I love java12 and Java18";
        String s2 = "abbbbbb";
        // 抓取 java12 18 里的 java
        // String regex1 = "((?i)java)(?=12|18)"; // (?i) 表示忽略大小写
        // String regex2 = "((?i)java)(?:12|18)";
        // String regex3 = "((?i)java)(?!12|18)";
        String regex4 = "ab+?"; // + 表示前面的字符出现一次或多次，? 表示前面的字符出现0次或1次
        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(s2);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
