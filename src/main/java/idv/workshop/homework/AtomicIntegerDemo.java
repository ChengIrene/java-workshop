package idv.workshop.homework;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo extends Thread {
    AtomicInteger num = new AtomicInteger();

    @Override
    public void run() {
        num.incrementAndGet();  //可以保證num這個物件資源在進行 +1 運作是原子操作
        System.out.println(num.get());  //保證num的數據資料會在主記憶體中取得
    }
    public static void main(String[] args) {
        AtomicIntegerDemo ai = new AtomicIntegerDemo();
        ai.start();
    }
}
