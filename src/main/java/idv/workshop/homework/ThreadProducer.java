package idv.workshop.homework;

//假設生產者每次生產一個int整數交給店員

public class ThreadProducer implements Runnable {

    private ThreadClerk clerk;

    public ThreadProducer(ThreadClerk clerk) {
        this.clerk = clerk;
    }

    public void run() {
        System.out.println("生產者開始生產整數......");
        for(int product = 1; product <= 10; product++) {  //產生1~10的整數
            try{
                clerk.setProduct(product);  //將產品交給店員
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
