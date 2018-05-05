package idv.workshop.homework;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyClerk2 {
    private int product = -1;
    private Lock lock = new ReentrantLock();
    //分別為了生產者執行緒與消費者執行緒建立了Condition物件
    private Condition producerCond = lock.newCondition();  //擁有生產者等待集合
    private Condition consumerCond = lock.newCondition();  //擁有消費者等待集合

    public void setProduct(int product) throws InterruptedException {
        lock.lock();
        try {
            waitIfFull();
            this.product = product;
            System.out.printf("生產者設定 (%d)%n", this.product);
            consumerCond.signal();  //通知消費者等待集合中的消費者執行緒
        } finally {
            lock.unlock();
        }
    }

    private void waitIfFull() throws InterruptedException {
        while (this.product != -1) {
            producerCond.await();  //至生產者等待集合等待
        }
    }

    public int getProduct() throws InterruptedException {
        lock.lock();
        try {
            waitIfEmpty();
            int p = this.product;
            this.product = -1;
            System.out.printf("消費者取走 (%d)%n", p);
            producerCond.signal();  //通知生產者等待集合中的生產執行緒
            return p;
        } finally {
            lock.unlock();
        }
    }

    private void waitIfEmpty() throws InterruptedException {
        while (this.product == -1) {
            consumerCond.await();  //至消費者等待集合等待
        }
    }
}
