package idv.workshop.homework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class OcpSumTask extends RecursiveTask<Integer> {
    static final int DATA_MAX_LENGTH = 3;
    int startIdx, endIdx;
    int[] data;

    public OcpSumTask(int[] data, int startIdx, int endIdx) {
        this.data = data;
        this.startIdx = startIdx;
        this.endIdx = endIdx;
    }

    @Override
    protected Integer compute() {
        int sum = 0;
        if (endIdx - startIdx <= DATA_MAX_LENGTH) {
            for (int i = startIdx; i < endIdx; i++) {
                sum += data[i];
            }
            return sum;
        } else {
            OcpSumTask s1 = new OcpSumTask(data, startIdx + DATA_MAX_LENGTH, endIdx);
            s1.fork();
            OcpSumTask s2 = new OcpSumTask(data, startIdx, Math.min(endIdx, startIdx + DATA_MAX_LENGTH));
            s2.compute();

            return s2.compute() + s1.join();
        }
    }
}

class TestSumTask {
    public static void main(String[] args) {
        ForkJoinPool p = new ForkJoinPool();
        int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int x = p.invoke(new OcpSumTask(data, 0, data.length));
        System.out.println(x);
    }
}