package idv.workshop.homework;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Stock {
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private int price;

    public Stock(int price) {
        this.price = price;
    }

    public int getPrice() {
        try {
            lock.readLock().lock();  //取得鎖定
            return price;
        } finally {
            lock.readLock().unlock();  //解鎖
        }
    }

    public void setPrice(int price) {
        try {
            lock.writeLock().lock();  //取得鎖定
            Thread.sleep(1000);
            this.price = price;
        }

        catch(InterruptedException e) {

        }

        finally {
            lock.writeLock().unlock();  //解鎖
        }
    }
}
