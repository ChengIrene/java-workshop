package idv.workshop.homework;

import java.time.LocalDate;

public class JavaSE9Ch13Exercise2 {
    public static void main(String[] args) {
        JavaSE9Ch13Exercise2 test = new JavaSE9Ch13Exercise2();
        test.calendar();
    }

    public void calendar() {

        LocalDate calendar = LocalDate.of(2014, 5, 1);
        int month = calendar.getMonthValue();

        System.out.println("民國 103 年 05 月 05 日 星期一");
        System.out.println("");
        System.out.println("日\t一\t二\t三\t四\t五\t六");

        for (int i = 1; i < 5 ; i++) {
            System.out.print("\t");
        }

        while (calendar.getMonthValue() == month) {

            int day = calendar.getDayOfMonth();

            if (day < 10) {
                System.out.print(" " + day + "\t");
            } else {
                System.out.print("" + day + "\t");
            }
            
            if (day % 7 == 3) {
                System.out.println();
            }

            calendar = calendar.plusDays(1);  //靠杯喔原來要這樣寫||| 害我卡這麼久Q_Q
        }
    }
}
