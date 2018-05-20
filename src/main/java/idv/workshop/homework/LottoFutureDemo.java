package idv.workshop.homework;

import java.util.concurrent.FutureTask;

// Future的目的在協助取得未來的結果,得到了執行結果就可以用get()方法來取得,另外也有isDone()方法用來判斷結果是否已取得

public class LottoFutureDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我一組 0~99 的幸運數字!!!");
        FutureTask<Integer> task = new FutureTask<>(new LottoCallableDemo());  // FutureTask是Future介面的實作類別
        new Thread(task).start();
        System.out.println("計算中...");
        System.out.println("您的幸運數字是: " + task.get());
    }
}
