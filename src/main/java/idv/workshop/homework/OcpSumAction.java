package idv.workshop.homework;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class OcpSumAction extends RecursiveAction {
    static final int DATA_MAX_LENGTH = 3;
    int startIdx, endIdx;
    int[] data;

    public OcpSumAction(int[] data, int startIdx, int endIdx) {
        this.data = data;
        this.startIdx = startIdx;
        this.endIdx = endIdx;
    }

    @Override
    protected void compute() {
        int sum = 0;
        if (endIdx - startIdx <= DATA_MAX_LENGTH) {  // 第一次:9 - 0, 第二次:9 - 3, 第三次:9 - 6, 第四次 9 - 9
            for (int i = startIdx; i < endIdx; i++) {
                sum += data[i];
            }
            System.out.println(sum);
        } else {
            //使用遞迴呼叫自己
            new OcpSumAction(data, startIdx + DATA_MAX_LENGTH, endIdx).fork();
            new OcpSumAction(data, startIdx, Math.min(endIdx, startIdx + DATA_MAX_LENGTH)).compute();
            // 第一次為 1+2+3=6, 第二次為 4+5+6=15, 第三次為 7+8+9=24, 第四次為 10, 合計為55
            // 印出來為 6 15 10 24 (10算得比24快
        }
    }

    public static void main(String[] args) {
        ForkJoinPool p = new ForkJoinPool();
        int data[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        p.invoke(new OcpSumAction(data, 0 , data.length));
    }
}
