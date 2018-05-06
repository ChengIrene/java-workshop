package idv.workshop.homework;

import java.util.concurrent.Executor;

public class ConcurrencyDirectExecutor implements Executor {
    public void execute(Runnable r) {
        r.run();
    }
}
