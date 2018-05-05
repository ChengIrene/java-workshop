package idv.workshop.homework;

public class ConcurrencyConsumer implements Runnable {
    private ConcurrencyClerk2 clerk2;

    public ConcurrencyConsumer(ConcurrencyClerk2 clerk2) {
        this.clerk2 = clerk2;
    }

    public void run() {
        System.out.println("消費者開始消耗整數~~~");
        for(int i = 1; i <= 10; i++) {  //消費10次整數
            try {
                clerk2.getProduct();  //從店員取走商品
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
