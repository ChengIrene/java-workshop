package idv.workshop.homework;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyArrayList<E> {
    private Lock lock = new ReentrantLock();  //使用ReentrantLock
    //ReentrantLock 在已經有執行緒取得Lock物件鎖定時,嘗試再次用同一Lock物件鎖定是可以的

    private Object[] elems;
    private int next;

    public ConcurrencyArrayList(int capacity) {
        elems = new Object[capacity];
    }

    public ConcurrencyArrayList() {
        this(16);
    }

    public void add(E elem) {
        lock.lock();  //進行鎖定
        //想要鎖定物件,可以呼叫其lock()方法

        try {
            if (next == elems.length) {
                elems = Arrays.copyOf(elems, elems.length * 2);
            }
            elems[next++] = elem;
        } finally {  //為了避免呼叫Lock()後,於後續執行流程中丟出例外而無法解除鎖定,一定要在finally中呼叫Lock物件的unlock()方法
            lock.unlock();  //解除鎖定
            //只有取得Lock物件鎖定的執行緒,才可以繼續往後執行程式碼,要解除鎖定,可以呼叫Lock物件的unlock()
        }
    }

    public E get(int index) {
        lock.lock();  //進行鎖定
        try {
            return (E) elems[index];
        } finally {
            lock.unlock();  //解除鎖定
        }
    }

    public int size() {
        lock.lock();  //進行鎖定
        try {
            return next;
        } finally {
            lock.unlock();  //解除鎖定
        }
    }
}
