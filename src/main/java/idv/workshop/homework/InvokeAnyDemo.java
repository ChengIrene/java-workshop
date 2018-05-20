package idv.workshop.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("請給我一組 0~99 的 Lotto 數字!!!");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Integer>> list = new ArrayList<>();
        list.add(new LottoCallableDemo());
        list.add(new LottoCallableDemo());
        list.add(new LottoCallableDemo());
        list.add(new LottoCallableDemo());
        list.add(new LottoCallableDemo());
        System.out.println("計算中...");
        int result = service.invokeAny(list);  //取得第一個所回傳的Future物件(未拋出例外情況下)
        service.shutdown();
        System.out.println("您的Lotto數字是: " + result);  //印出得到的第一個Lotto號碼
    }
}
