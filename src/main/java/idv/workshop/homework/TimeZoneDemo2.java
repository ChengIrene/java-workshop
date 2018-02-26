package idv.workshop.homework;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneDemo2 {
    public static void main(String[] args) {
        TimeZone taipeiTz = TimeZone.getTimeZone("Asia/Taipei");
        Calendar calendar = Calendar.getInstance(taipeiTz);
        showTime(calendar);

        TimeZone copenhagenTz = TimeZone.getTimeZone("Europe/Copenhagen");
        calendar.setTimeZone(copenhagenTz);  //用setTimeZone()方法設定TimeZone
        showTime(calendar);
    }

    static void showTime(Calendar calendar) {
        System.out.print(calendar.getTimeZone().getDisplayName());
        System.out.printf(" %d:%d%n", calendar.get(Calendar.HOUR), calendar.get(Calendar.MINUTE));
    }
}
