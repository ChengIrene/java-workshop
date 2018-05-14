package idv.workshop.homework;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ConcurrencyProducerConsumerDemo3 {
    public static void main(String[] args) {
        BlockingQueue queue = new ArrayBlockingQueue(1);  //容量為1
        new Thread(new ConcurrencyProducer3(queue)).start();
        new Thread(new ConcurrencyConsumer3(queue)).start();
    }
}
