package idv.workshop.homework;

import java.util.Date;
import java.util.concurrent.ForkJoinPool;

//因為用遞迴會跑非常非常久,所以就直接不run了

public class ForkJoinDemo {
    public static void main(String[] args) {
        int n = 30;

        //遞迴求解
        long t1 = new Date().getTime();
        long result = FibonacciRecursive.fibonacciNumber(n);
        System.out.print(result + " , ");
        long t2 = new Date().getTime();
        System.out.println("花費時間: " + (t2 - t1));

        //ForkJoin
        long t3 = new Date().getTime();
        int processors = Runtime.getRuntime().availableProcessors();
        FibonacciTask task = new FibonacciTask(n);
        ForkJoinPool pool = new ForkJoinPool(processors);  //建立ForkJoinPool執行緒池實例,並設定執行的CPU核心數量
        pool.invoke(task);  //開始透過Fork/Join分派任務
        System.out.print(task.getResult() + " , ");
        long t4 = new Date().getTime();
        System.out.print("花費時間: " + (t4 - t3) + " , ");
        System.out.println("Processors: " + processors);
    }
}
