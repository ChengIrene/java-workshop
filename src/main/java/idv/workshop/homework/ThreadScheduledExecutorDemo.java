package idv.workshop.homework;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ThreadScheduledExecutorDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我一組 0~99 的 Lotto 數字!!!");
        ScheduledExecutorService exec = null;
        exec = Executors.newSingleThreadScheduledExecutor();  //表示用單一執行緒來執行排定工作
        System.out.println("停一秒後開始排程..." + new Date());
        ScheduledFuture<Integer> future = exec.schedule(new LottoCallableDemo(), 1000, TimeUnit.MICROSECONDS);
        System.out.println("計算中...");
        int result = future.get();
        System.out.println("您的 Lotto 數字是:" + result);
        exec.shutdown();
    }
}
