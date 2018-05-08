package idv.workshop.homework;

// 改寫ConcurrencyFutureCallableDemo為使用ExecutorService的版本

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ConcurrencyFutureCallable2Demo {

    static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newCachedThreadPool();

        System.out.println("老闆,我要第30個費式數,待會來拿~~~");

        Future<Long> the30thFibFuture = service.submit(() -> fibonacci(30));

        while (!the30thFibFuture.isDone()) {
            System.out.println("先忙別的事去~~~");
        }

        System.out.printf("第 30 個費式數: %d%n", the30thFibFuture.get());
    }
}
