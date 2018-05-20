package idv.workshop.homework;

import java.util.Date;

public class LottoDemo2 implements Runnable {
    @Override
    public void run() {
        try{
            Thread.sleep(1000);  //模擬要花費的時間
        } catch (Exception ex) {}
        int number = (int)(Math.random() * 100);
        System.out.println("\t得到 " + number + " 的時間: " + new Date());
    }
}
