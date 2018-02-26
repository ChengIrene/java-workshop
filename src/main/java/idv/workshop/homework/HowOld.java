package idv.workshop.homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HowOld {
    public static void main(String[] args) throws Exception {
        System.out.print("輸入出生年月日 (yyyy-mm-dd): ");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date birthDate = dateFormat.parse(new Scanner(System.in).nextLine());  //用parse()方法剖析生日的Date
        Date currentDate = new Date();
        long life = currentDate.getTime() - birthDate.getTime();  //現在的時間減去出生的時間(毫秒)
        System.out.println("你今年的歲數為: " + (life / (365 * 24 * 60 * 60 * 1000L)));

        //不過這個範例是有瑕疵的,歲數不像一年的毫秒可以單純用 365 * 24 * 60 * 60 * 1000 計算出來,所以只是簡單示範而已
    }
}
