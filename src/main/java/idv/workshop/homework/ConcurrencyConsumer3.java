package idv.workshop.homework;

import java.util.concurrent.BlockingQueue;

public class ConcurrencyConsumer3 implements Runnable {
    private BlockingQueue<Integer> productQueue;

    public ConcurrencyConsumer3(BlockingQueue<Integer> productQueue) {
        this.productQueue = productQueue;
    }

    public void run() {
        System.out.println("消費者開始消耗整數!!!");
        for(int i = 1; i <= 10; i++) {
            try {
                int product = productQueue.take();
                System.out.printf("消費這消耗整數 (%d)%n", product);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
