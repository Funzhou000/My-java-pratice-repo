package APIPratice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timeDemo2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        java.util.Date date = new java.util.Date(0L);
        String str = sdf.format(date);
        System.out.println(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(date);
        System.out.println(str2);
        String str3 = "2025-12-30 41:11:11";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date str5 = sdf3.parse(str3);

        System.out.println(str5);
    }
}
