package idv.workshop.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class InvokeAllDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我五組 0~99 的 Lotto數字!!!");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new LottoCallableDemo());
        list.add(new LottoCallableDemo());
        list.add(new LottoCallableDemo());
        list.add(new LottoCallableDemo());
        list.add(new LottoCallableDemo());
        System.out.println("計算中...");
        List<Future<Integer>> resultList = service.invokeAll(list);  //取得所有回傳的Future物件集合
        System.out.print("您的Lotto數字是: ");
        for(Future future : resultList) {
            System.out.print(future.get()+ " ");  //透過future.get()取出號碼
        }
        service.shutdown();
    }
}
