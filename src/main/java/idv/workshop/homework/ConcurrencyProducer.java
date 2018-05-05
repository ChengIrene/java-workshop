package idv.workshop.homework;

public class ConcurrencyProducer implements Runnable {
    private ConcurrencyClerk2 clerk2;

    public ConcurrencyProducer(ConcurrencyClerk2 clerk2) {
        this.clerk2 = clerk2;
    }

    public void run() {
        System.out.println("生產者開始生產整數~~~");
        for(int product = 1; product <= 10; product++) {
            try {
                clerk2.setProduct(product);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
