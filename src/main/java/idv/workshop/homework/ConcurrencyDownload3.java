package idv.workshop.homework;

import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyDownload3 {

    public static void main(String[] args) throws Exception {
        URL[] urls = {
                new URL("https://github.com/ChengIrene")
        };

        String[] fileNames = {
                "GitHub.html"
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        new ConcurrencyPages(urls, fileNames, executorService).download();
        executorService.shutdown();  //shutdown()方法會在指定執行的Runnable都完成後,將ExecutorService關閉(這邊就是關閉ThreadPoolExecutor)
    }
}
