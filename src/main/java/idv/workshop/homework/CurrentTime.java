package idv.workshop.homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {
        //這個範例可以讓使用者指定格式,"EE"表示星期格式設定
        //不過這個三元運算子的arg部分不太了解
        DateFormat dateFormat = new SimpleDateFormat(args.length == 0 ? "EE-MM-dd-yyyy" : args[0]);
        System.out.println(dateFormat.format(new Date()));
    }
}
