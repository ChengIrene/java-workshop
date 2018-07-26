package idv.workshop.homework;

import java.util.concurrent.atomic.AtomicInteger;

public class OcpGetThread implements Runnable {
    private static AtomicInteger counter = new AtomicInteger(0);

    @Override
    public void run() {
        int c = counter.incrementAndGet();
        System.out.println(c + " ");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new OcpGetThread());
        Thread t2 = new Thread(new OcpGetThread());
        Thread t3 = new Thread(new OcpGetThread());

        Thread[] threads = {t1, t2, t3};
        for (Thread t : threads) {
            t.start();
        }
    }
}
