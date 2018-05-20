package idv.workshop.homework;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleWithFixedDelayDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我 0~99 的 Lotto 數字!!!");
        ScheduledExecutorService exec = null;
        exec = Executors.newSingleThreadScheduledExecutor();
        System.out.println("停一秒後開始排程..." + new Date());

        //每一次排程任務時間顯示將會差2秒( = 排程嚴遲1秒 + LottoDemo2任務1秒)
        //若改為scheduleAtFixedRate,因LottoDemo2的任務並沒有超過排定週期的時間,所以每一次排程任務時間顯示將僅差1秒( = LottoDemo2 任務1秒)
        exec.scheduleWithFixedDelay(new LottoDemo2(), 1000, 1000, TimeUnit.MICROSECONDS);
        System.out.println("計算中...");
    }
}
