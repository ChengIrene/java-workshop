package idv.workshop.homework;

public class ConcurrencyClerk2Demo {
    public static void main(String[] args) {
        ConcurrencyClerk2 clerk2 = new ConcurrencyClerk2();
        new Thread(new ConcurrencyProducer(clerk2)).start();
        new Thread(new ConcurrencyConsumer(clerk2)).start();
    }
}
