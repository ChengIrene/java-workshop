package idv.workshop.homework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

class Fibonacci extends RecursiveTask<Long> {  //繼承RecursiveTask
    final long n;

    Fibonacci(long n) {
        this.n = n;
    }

    @Override
    public Long compute() {  //實作compute()方法
        if (n <= 20) {
            return solveFibonacciSequentially(n);  //20以下就不分解了,直接循序運算
        }
        ForkJoinTask<Long> subTask = new Fibonacci(n - 1).fork();  //分解出 n-1 子任務,請ForkJoinPool分配執行緒來執行這個子任務
        return new Fibonacci(n - 2).compute() + subTask.join();  //取得此子任務執行結果
                  //分解出 n-2 子任務,並直接計算
    }

    static long solveFibonacciSequentially(long n) {
        if (n <= 1) {
            return n;
        }
        return solveFibonacciSequentially(n - 1) + solveFibonacciSequentially(n - 2);
    }
}


public class ConcurrencyFibonacciForkJoin {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(45);
        ForkJoinPool pool = new ForkJoinPool();
        System.out.println(pool.invoke(fibonacci));  //開始分而治之
    }
}
