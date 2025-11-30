package APIPratice;

import java.sql.Date;
import java.util.Random;

public class timeDemo {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date(0);
        long temp = date.getTime();// ms since 1970.1.1
        temp += 1000L * 60 * 60 * 24 * 365;
        date.setTime(temp);
        System.out.println(date);

        Random r = new Random();
        java.util.Date date2 = new java.util.Date(r.nextInt());
        java.util.Date date3 = new java.util.Date(r.nextInt());
        if (date2.getTime() > date3.getTime()) {
            System.out.println("date2" + date2);
            System.out.println("2>3");
        } else {
            System.out.println("date3" + date3);
            System.out.println("3>2");
        }

    }
}
