package idv.workshop.homework;

import java.util.concurrent.FutureTask;

public class ConcurrencyFutureCallableDemo {

    static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  //用Recursion方法求Fibonacci Number
    }

    public static void main(String[] args) throws Exception {
        // Future定義的行為,就是讓你在將來取得結果,FurtureTask是Future的實作類別
        // 由於FutureTask也實作了Runnable介面(RunnableFuture的父介面),所以可以指定給Thread建構之用
        FutureTask<Long> the30thFibFuture = new FutureTask<>(() -> fibonacci(30));

        System.out.println("老闆,我要第30個費式數,待會來拿喔~~~");

        new Thread(the30thFibFuture).start();  // 建立新執行緒

        while (!the30thFibFuture.isDone()) {  // isDone()方法判斷是否結束(Boolean)
            System.out.println("先忙別的事情去~~~");
        }

        // 如果流程以定義在某個Runnable物件中,FutureTask建構時也有接受Runnable的版本,並可指定一個物件在呼叫get()時傳回(運算結束後)
        System.out.printf("第30個費式數: %d%n", the30thFibFuture.get());
    }
}
