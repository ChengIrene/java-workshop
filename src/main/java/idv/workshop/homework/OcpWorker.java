package idv.workshop.homework;

import java.util.concurrent.CyclicBarrier;

public class OcpWorker extends Thread {
    CyclicBarrier cb;
    public OcpWorker(CyclicBarrier cb) {
        this.cb = cb;
    }

    @Override
    public void run() {
        try {
            cb.await();  // 等待 (循環路障的柵欄之意
            System.out.println("Worker...");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BarrierAction action = new BarrierAction();
        CyclicBarrier cb = new CyclicBarrier(1, action);  //參數一決定多少個thread可放行,參數二決定遇到路障時該做什麼事
        OcpWorker w = new OcpWorker(cb);
        w.start();
    }
}

class BarrierAction extends Thread {
    public void run() {
        System.out.println("Master...");
    }
}
