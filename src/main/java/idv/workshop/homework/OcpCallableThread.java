package idv.workshop.homework;

import java.util.concurrent.*;

public class OcpCallableThread implements Callable<String> {
    String s;
    public OcpCallableThread(String s) {
        this.s = s;
    }

    @Override
    public String call() throws Exception {
        return s + " Call";
    }

    public static void main(String[] args) throws Exception {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<String> fi = es.submit(new OcpCallableThread("Call"));
        System.out.println(fi.get());
        es.shutdown();  //最後必須加上這行才會結束執行緒
    }
}
