package idv.workshop.homework;

import java.util.Arrays;
import java.util.concurrent.locks.StampedLock;

public class ConcurrencyArrayList3<E> {
    private StampedLock lock = new StampedLock();  //使用StampedLock
    private Object[] elems;
    private int next;

    public ConcurrencyArrayList3(int capacity) {
        elems = new Object[capacity];
    }

    public ConcurrencyArrayList3() {
        this(16);
    }

    public void add(E elem) {
        long stamp = lock.writeLock();  //取得寫入鎖定
        try {
            if (next == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[next++] = elem;
        } finally {
            lock.unlockWrite(stamp);  //解除寫入鎖定
        }
    }

    public E get(int index) {
        long stamp = lock.tryOptimisticRead();  //試著樂觀讀取鎖定
        Object elem = elems[index];
        if (!lock.validate(stamp)) {  //查詢是否有排他的鎖定
            stamp = lock.readLock();  //真正的讀取鎖定!!!
            try {
                elem = elems[index];
            } finally {
                lock.unlockRead(stamp);  //解除讀取鎖定
            }
        }
        return (E) elem;
    }

    public int size() {
        long stamp = lock.tryOptimisticRead();  //樂觀讀取鎖定
        int size = next;
        if (!lock.validate(stamp)) {  //查詢是否有排他的鎖定
            stamp = lock.readLock();  //真正的鎖定!!!
            try {
                size = next;
            } finally {
                lock.unlockRead(stamp);  //解除鎖定
            }
        }
        return size;
    }
}
