package idv.workshop.homework;

import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Integer> {
    private int num = 0;
    private int result = 0;
    FibonacciTask(int num) {
        this.num = num;
    }

    public long getResult() {
        return result;
    }

    @Override
    protected Integer compute() {
        if(num < 29) {  //門檻值
            //小於29就直接利用單執行緒遞迴求解
            long result = FibonacciRecursive.fibonacciNumber(num);
        } else {
            FibonacciTask task1 = new FibonacciTask(num - 1);  //根據Fibonacci公式建立分解 num - 1 子任務實例
            task1.fork();  //進行分解 (ForkJoinPool將會分配一條執行緒來執行此任務)
            FibonacciTask task2 = new FibonacciTask(num - 2);  ////根據Fibonacci公式建立分解 num - 2 子任務實例

            //task2.compute(): 試著取得 num - 2 的值,根據之前拆分的子任務回報結果,若有必要可能再會往下拆分子任務
            //task1.join(): 取得之前拆分的子任務結果
            result = task2.compute() + task1.join();
        }
        return result;
    }
}