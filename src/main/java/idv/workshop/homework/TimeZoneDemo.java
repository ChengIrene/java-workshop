package idv.workshop.homework;

import java.util.TimeZone;

public class TimeZoneDemo {
    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getDisplayName());
        System.out.println("\t時區ID: " + timeZone.getID());
        System.out.println("\t日光節約時數: " + timeZone.getDSTSavings());
        System.out.println("\tUTC 偏移毫秒數: " + timeZone.getRawOffset());
    }
}
