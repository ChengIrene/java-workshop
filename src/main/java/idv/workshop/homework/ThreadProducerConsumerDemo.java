package idv.workshop.homework;

// 以下的程式為示範Producer.Consumer與Clerk

public class ThreadProducerConsumerDemo {
    public static void main(String[] args) {
        ThreadClerk clerk = new ThreadClerk();
        new Thread(new ThreadProducer(clerk)).start();
        new Thread(new ThreadConsumer(clerk)).start();
    }

    // 生產者會生產10個整數,而消費者會消耗10個整數,雖然生產與消費的速度不一,
    // 由於店員處只能放置一個整數,所以只能每生產一個才消耗一個
}
