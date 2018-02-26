package idv.workshop.homework;

import java.util.Date;

import static java.text.DateFormat.*;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        dateInstanceDemo(date);
        timeInstanceDemo(date);
        dateTimeInstanceDemo(date);
    }

    static void dateInstanceDemo(Date date) {
        System.out.println("getDateInstance() demo");
        System.out.printf("\tLONG: %s%n", getTimeInstance(LONG).format(date));
        System.out.printf("\tSHORT: %s%n", getDateInstance(SHORT).format(date));
    }

    static void timeInstanceDemo (Date date) {
        System.out.println("getTimeInstance() demo");
        System.out.printf("\tLONG: %s%n", getTimeInstance(LONG).format(date));
        System.out.printf("\tMEDIUM: %s%n", getTimeInstance(MEDIUM).format(date));
        System.out.printf("\tSHORT: %s%n", getTimeInstance(SHORT).format(date));
    }

    static void dateTimeInstanceDemo(Date date) {
        System.out.println("getDateTimeInstance() demo");
        System.out.printf("\tLONG: %s%n", getDateTimeInstance(LONG, LONG).format(date));
        System.out.printf("\tMEDIUM: %s%n", getDateTimeInstance(SHORT, MEDIUM).format(date));
        System.out.printf("\tSHORT: %s%n", getDateTimeInstance(SHORT, SHORT).format(date));
    }
}
