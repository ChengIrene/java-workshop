package idv.workshop.homework;

import java.util.Date;

public class GetTimeRunnable implements Runnable {
    public void run() {
        String tName = Thread.currentThread().getName();  //取得執行緒名稱
        System.out.println(tName + ":" + new Date());
    }
}
