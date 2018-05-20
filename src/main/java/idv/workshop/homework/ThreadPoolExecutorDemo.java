package idv.workshop.homework;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我一組 0~99 的 Lotto 數字!!!");

        //可以改成 newFixedThreadPool(2); 在執行緒池建立固定數量的執行緒讓Runnable或Callable物件來執行
        ThreadPoolExecutor exec = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        System.out.println("計算中...");

        //透過調用submit()方法並注入Callable物件(new Lotto()),並得到一個Future的結果
        Future<Integer> future = exec.submit(new LottoCallableDemo());
        int result = future.get();
        System.out.println("您的 Lotto 數字是: " + result);
        exec.shutdown();  //卸載ThreadPoolExecutor
    }
}
