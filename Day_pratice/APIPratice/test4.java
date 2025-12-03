package APIPratice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class test4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2005, 11, 9);
        LocalDate today = LocalDate.now();
        long time = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("距离出生那日过去了" + time + "天");
        // long days = birthday.until(today).getDays();
        // System.out.println("距离生日过去了" + days + "天");
    }
}
