package APIPratice;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Set;

public class Jdk8timePratice {
    public static void main(String[] args) {
        zonedDateTime();
        zoneId();
        instant();
        getFormattedDateTime();
        getBirthday();
        getStr();
    }

    private static void getStr() {
        System.out.println("-------------------");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Double.parseDouble(str));
        sc.close();
    }

    private static void getBirthday() {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2005, 11, 9, 0, 0, 0);
        System.out.println("年龄" + ChronoUnit.YEARS.between(birthday, today) + "岁");
        // 假设今年已经过生日
        System.out.println("距离下次生日还有"
                + ChronoUnit.DAYS.between(today, birthday.plusYears(ChronoUnit.YEARS.between(birthday, today) + 1))
                + "天");
    }

    private static void getFormattedDateTime() {
        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss  EE a");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
    }

    private static void zonedDateTime() {
        ZonedDateTime time1 = ZonedDateTime.now();
        System.out.println(time1);
        ZonedDateTime time2 = ZonedDateTime.of(2077, 5, 20, 10, 10, 10, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time2);
        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime time3 = instant.atZone(zoneId);
        System.out.println(time3);
        ZonedDateTime time4 = time3.withDayOfMonth(22);
        System.out.println(time4);
        ZonedDateTime time5 = time4.minusDays(2);
        System.out.println(time5);
        time5 = time5.plusHours(5);
        System.out.println(time5);
    }

    private static void zoneId() {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        ZoneId currentSystemZone = ZoneId.systemDefault();
        System.out.println(currentSystemZone);
        ZoneId of = ZoneId.of("Asia/Srednekolymsk");
        System.out.println(of);
    }

    private static void instant() {
        Instant instant1 = Instant.now();
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(1);
        System.out.println(instant2);
        System.out.println(instant1.atZone(ZoneId.of("Europe/Riga")));
        System.out.println(instant1.isAfter(instant2));
        Instant instant3 = instant2.minusSeconds(1);
        System.out.println(instant3);
        Instant instant4 = instant3.plusSeconds(10);
        System.out.println(instant4);
    }
}
