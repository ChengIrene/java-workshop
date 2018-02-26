package idv.workshop.homework;

import java.time.Month;

public class MonthDemo {
    public static void main(String[] args) {
        for(Month month : Month.values()) {
            System.out.printf("original %d\tvalue: %d\t%s%n", month.ordinal(), month.getValue(), month);
            // ordinal()為定義時的順序,是從0開始
            // 所以要取得代表月份的數要透過 getValue()方法
        }
    }
}
