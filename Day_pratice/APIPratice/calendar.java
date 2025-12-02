package APIPratice;

import java.util.Calendar;
import java.util.Date;

public class calendar {
    public static void main(String[] args) {
        java.util.Calendar c = java.util.Calendar.getInstance();

        Date date2 = c.getTime();
        System.out.println(date2);
        System.out.println("----------------");
        System.out.println(c.getTimeInMillis());
        System.out.println("----------------");
        c.set(Calendar.MONTH, 0);
        // int year = c.get(java.util.Calendar.YEAR);
        // int month = c.get(java.util.Calendar.MONTH) + 1;
        // int day = c.get(java.util.Calendar.DAY_OF_MONTH);
        getTimeInCN(c);
        c.add(Calendar.MONTH, 4);
        getTimeInCN(c);// 25-11-2
    }

    private static void getTimeInCN(Calendar c) {
        String date = "";
        int year = c.get(java.util.Calendar.YEAR);
        int month = c.get(java.util.Calendar.MONTH) + 1;
        int day = c.get(java.util.Calendar.DAY_OF_MONTH);
        date = year + "年" + month + "月" + day + "日";
        System.out.println(date);

    }
    // 查表法返回日期
}
