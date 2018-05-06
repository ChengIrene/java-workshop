package idv.workshop.homework;

import java.util.concurrent.Executor;

public class ConcurrencyTreadPerTaskExecutor implements Executor {
    public void execute(Runnable r) {
        new Thread(r).start();
    }
}
