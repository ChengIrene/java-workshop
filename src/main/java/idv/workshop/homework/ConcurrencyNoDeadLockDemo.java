package idv.workshop.homework;

import java.util.concurrent.locks.ReentrantLock;

class NoDeadLockDemoResource {
    private ReentrantLock lock = new ReentrantLock();
    private String name;

    NoDeadLockDemoResource(String name) {
        this.name = name;
    }

    void cooperate(NoDeadLockDemoResource res) {
        while (true) {
            try {
                if (lockMeAnd(res)) {  //取得目前與傳入的Resource之Lock鎖定
                    System.out.printf("%s 整合 %s 的資源%n", this.name, res.name);  //如果兩個Resource的Lock都取得鎖定,才執行資源整合
                    break;  //整合成功離開迴圈
                }
            } finally {
                unLockMeAnd(res);  //解除目前與傳入的Resource之Lock鎖定
            }
        }
    }

    private boolean lockMeAnd(NoDeadLockDemoResource res) {
        return this.lock.tryLock() && res.lock.tryLock();
    }

    private void unLockMeAnd(NoDeadLockDemoResource res) {
        if (this.lock.isHeldByCurrentThread()) {  //看現在的執行緒是否是鎖定的狀態(boolean),所以true的話便解鎖
            this.lock.unlock();
        }
        if (res.lock.isHeldByCurrentThread()) {
            res.lock.unlock();
        }
    }
}

public class ConcurrencyNoDeadLockDemo {

    public static void main(String[] args) {
        NoDeadLockDemoResource res1 = new NoDeadLockDemoResource("resource1");
        NoDeadLockDemoResource res2 = new NoDeadLockDemoResource("resource2");

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                res1.cooperate(res2);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                res2.cooperate(res1);
            }
        });

        thread1.start();
        thread2.start();
    }
}
