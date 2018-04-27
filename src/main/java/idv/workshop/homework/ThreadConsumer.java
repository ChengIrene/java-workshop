package idv.workshop.homework;

//消費者從店員處取走int整數

public class ThreadConsumer implements Runnable {
    private ThreadClerk clerk;

    public ThreadConsumer(ThreadClerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println("消費者開始消耗整數......");
        for(int i = 1; i <= 10; i++) {  //消費10次整數
            try {
                clerk.getProduct();  //從店員取走商品
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
