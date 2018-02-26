package idv.workshop.homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HowOld2 {
    public static void main(String[] args) {
        System.out.print("輸入出生年月日(yyyy-mm-dd): ");
        LocalDate birth = LocalDate.parse(new Scanner(System.in).nextLine());
        LocalDate now = LocalDate.now();
        Period preriod = Period.between(birth, now);
        System.out.printf("你活了 %d 年 %d 月 %d 日%n", preriod.getYears(), preriod.getMonths(), preriod.getDays());
    }
}
