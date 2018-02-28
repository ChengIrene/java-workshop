package idv.workshop.homework;

import java.util.Calendar;

public class JavaSE9Ch13Exercise1 {
    public static void main(String[] args) {
        JavaSE9Ch13Exercise1 test = new JavaSE9Ch13Exercise1();
        test.calendar();
    }

    public void calendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2014, Calendar.MAY, 1);  //設定時間
        int month = calendar.get(Calendar.MONTH);  //取得當月的變數
        int week = calendar.get(Calendar.DAY_OF_WEEK);  //取得日期為一週第幾天的變數

        System.out.println("2014-5-5 星期一");
        System.out.println("");
        System.out.println("日\t一\t二\t三\t四\t五\t六");  //一週的第一天為週日

        //把一號前的空白給印出來
        for (int i = Calendar.SUNDAY; i < week; i++) {  //Calendar.SUNDAY = 1
            System.out.print("\t");
        }

        while (calendar.get(Calendar.MONTH) == month) {  //Calendar.MONTH會隨著add方法增加天數,在跳至下個月後離開迴圈

            int day = calendar.get(Calendar.DAY_OF_MONTH);  //取得日期的變數

            //如果日期小於十的話,為了對齊格式得補上空格
            if(day < 10) {
                System.out.print(" " + day +"\t");
            } else {
                System.out.print("" + day + "\t");
            }

            //如果碰上週六就要換行
            if (week == Calendar.SATURDAY) {
                System.out.println();
            }

            //很重要的兩行!!!
            calendar.add(Calendar.DAY_OF_MONTH, 1);  //每跑一次就要增加日期一天,超過當月的天數迴圈就會停止了
            week = calendar.get(Calendar.DAY_OF_WEEK);  //星期的部分也得跟著一起改變,重新獲得一週的第幾天
        }
    }
}
