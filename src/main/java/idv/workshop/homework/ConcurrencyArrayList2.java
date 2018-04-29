package idv.workshop.homework;

import java.util.Arrays;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// ReadWriteLock介面定義了讀取鎖定與寫入鎖定行為,可以使用readLock()、writeLock()方法傳回Lock實作物件
// ReentrantReadWriteLock是ReadWriteLock介面的主要實作類別
// readLock()方法會傳回ReentrantReadWriteLock.ReadLock實例
// writeLock()方法會傳回ReetrantReadWriteLock.WriteLock實例

public class ConcurrencyArrayList2<E> {
    private ReadWriteLock lock = new ReentrantReadWriteLock();  //使用ReadWriteLock
    private Object[] elems;
    private int next;

    public ConcurrencyArrayList2(int capacity) {
        elems = new Object[capacity];
    }

    public ConcurrencyArrayList2() {
        this(16);
    }

    public void add(E elem) {  //若有執行緒呼叫add()方法打算進行寫入操作時,先取得寫入鎖定
        lock.writeLock().lock();  //取得寫入鎖定
        try {
            if (next == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[next++] = elem;
        } finally {
            lock.writeLock().unlock();  //解除寫入鎖定
        }
    }

    public E get(int index) {  //若有執行緒呼叫get()方法打算進行讀取操作時,先取得讀取鎖定
        lock.readLock().lock();
        try {
            return (E) elems[index];
        } finally {
            lock.readLock().unlock();
        }
    }

    public int size() {
        lock.readLock().lock();  //取得讀取鎖定
        try {
            return next;
        } finally {
            lock.readLock().unlock();  //解除讀取鎖定
        }
    }

    //如此設計之後,若執行緒多是在呼叫get()或size()方法,就比較不會因等待鎖定而進入阻斷狀態,可以增加讀取效率
}