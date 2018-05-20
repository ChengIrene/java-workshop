package idv.workshop.homework;

import java.util.concurrent.Executor;

// java.util.concurrent.Executor的介面分離了執行緒定義與呼叫程序

class MyExecutor implements Executor {  //將執行緒開始方法封裝為execute()
    @Override
    public void execute(Runnable r) {
        new Thread(r).start();
    }
}

public class ExecutorDemo {
    public static void main(String[] args) throws Exception {
        Executor exec = new MyExecutor();
        exec.execute(new GetTimeRunnable());
        exec.execute(new GetTimeRunnable());
        exec.execute(new GetTimeRunnable());
    }
}
