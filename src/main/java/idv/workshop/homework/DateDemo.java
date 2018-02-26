package idv.workshop.homework;

import java.util.Date;

import static java.lang.System.currentTimeMillis;

public class DateDemo {
    public static void main(String[] args) {
        Date date1 = new Date(currentTimeMillis());
        Date date2 = new Date();  //內部亦是使用System.currentTimeMillis()來取得epoch毫秒

        //呼叫getTime()可取得內部保存的epoch毫秒數值
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());

        //出來的值會是1970年1月1日0時0分0秒至今經過的毫秒數
    }
}
