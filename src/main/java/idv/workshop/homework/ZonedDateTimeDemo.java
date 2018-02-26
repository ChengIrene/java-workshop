package idv.workshop.homework;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(0, 0, 0);  //ZonedDateTime會自動校正
        LocalDate localDate = LocalDate.of(1975, 4, 1);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime, ZoneId.of("Asia/Taipei"));

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime. toEpochSecond());
        System.out.println(zonedDateTime.toInstant().toEpochMilli());
    }
}
