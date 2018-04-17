package idv.workshop.homework;

import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.stream.Collectors;


// 參考資料: https://magiclen.org/java-8-lambda/

public class LambdaPractice {

    // 取代Functional Interface 產出的匿名類別
    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("RunRunRun");
            }
        };

        // Lambda
        Runnable runnable2 = () -> System.out.println("Run!!!");

        runnable1.run();  //RunRunRun
        runnable2.run();  //Run!!!

        // 走訪

        // for each 走訪一個List
        List<String> list = new LinkedList<>();
        list.add("許撩撩");
        list.add("白飛飛");
        list.add("李懟懟");
        list.add("周萌萌");
        list.add("以上四人都好棒,我都想要");

        for (String s : list) {
            System.out.println(s);
        }

        //用Lambda來走訪這些collection
        list.forEach(s -> System.out.println(s));

        //在Java 8中,Collection提供了stream()方法,可以對集合做一些過濾和基本運算,而且也是有經過效能優化過的
        //除了stream()方法外,還有parallelStream()方法,可以讓collection各別針對它的entry(條目??)另開出一個Thread,進行stream提供的運算

        List<String> list2 = new ArrayList<>();
        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        list2.add("5");

        list2.stream().filter(s -> Integer.valueOf(s) < 3).forEach(s -> System.out.println(s));

        List<String> list3 = list2.stream().filter(s -> Integer.valueOf(s) < 3).collect(Collectors.toList());
        list3.add("7");
        list3.forEach(s -> System.out.println(s));

        List<String> list4 = new ArrayList<>();
        list4.add("5");
        list4.add("4");
        list4.add("3");
        list4.add("2");
        list4.add("1");

        System.out.println(list4.stream().mapToInt(s -> Integer.valueOf(s)).sum());
        System.out.println(list4.stream().filter(s -> Integer.valueOf(s) < 3).mapToInt(s -> Integer.valueOf(s)).average().getAsDouble());


        // Lambda特殊精簡語法結構
        // 只要寫方法名稱即可,連參數都甭傳了
        // 但必須要明確指定方法名稱是在哪個類別或是哪個物件之下，而且最後一個「.」要改成「::」
        // 雖然可以使得程式變得非常精簡，卻也不易閱讀
        // 這種撰寫方式，實際上常與forEach搭配

        List<String> list5 = new ArrayList<String>();
        list5.add("給");
        list5.add("我");
        list5.add("SSR卡");
        list5.add("拜");
        list5.add("託");
        list5.add("嗚嗚嗚");
        list5.forEach(System.out::println);  //原來這個也是Lambda的一種!!!
    }
}