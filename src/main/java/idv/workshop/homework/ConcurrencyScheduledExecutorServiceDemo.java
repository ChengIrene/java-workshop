package idv.workshop.homework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrencyScheduledExecutorServiceDemo {

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();


        // public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,long initialDelay,long delay,TimeUnit unit);
        // 第一個參數為執行緒,第二個為初始延遲,第三個為後延遲(執行?排定?週期),第四個為時間單位
        // 不過Lambda的部分,其實不太了解那演化的過程...

        // 如果將scheduleWithFixedDelay()換為scheduleAtFixedRate()的話,每次排定的執行週期雖然為1秒,但由於每次工作執行實際上為2秒
        // 會超過排定周期,所以上一次執行完工作後,會立即執行下一次工作,結果就是時間顯示為2秒一個間隔

        // 如果再把Thread.sleep(2000)改為Thread.sleep(500)的話,由於每次工作執行不會超過排定週期,所以時間顯示會為1秒一個間隔

        service.scheduleWithFixedDelay(
                () -> {
                    System.out.println(new java.util.Date());
                    try {
                        Thread.sleep(2000);  //假設這個工作會進行兩秒(單位為毫秒)
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }, 2000, 1000, TimeUnit.MICROSECONDS );  //每次工作會執行2秒,而後延遲1秒,所以看到的時間顯示總共是3秒為一個間隔

    }
}
