package idv.workshop.homework;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

import static idv.workshop.homework.ForEach.forEach;

public class IterableString {
    public static void main(String[] args) {

        //嘗試寫個IterableString類別,可指定字串建構IterableString實例
        //讓該實例可以使用增強式for迴圈,或者本身的forEach()方法,逐一取出字串中的字元
        List<String> okita = Arrays.asList("Souji", "Kiyomitsu", "Yasusada");
        forEach(okita);

        List<String> hijikata = Arrays.asList("Tosizou", "Kanesada", "Kunihiro");
        foreach(hijikata);

        List<String> kondou = Arrays.asList("Isami", "Kotetsu");
        enhancedForLoop(kondou);

        //請撰寫程式,判斷字串陣列中有哪些字串,從前面看的字元順序與從後面看的字元順序式相同的
        String[] words = {"RADAR", "WARTER START", "MILK KLIM", "RESERVERED", "IWI"};
        Deque<String> results = new ArrayDeque<>();

        for(int i = 0; i < words.length; i++) {
            //因為reverse是StringBuffer的方法,所以這邊先將String轉成StringBuffer後再轉回String
            if(words[i].equals(new StringBuffer(words[i]).reverse().toString())) {
                results.offer(words[i]);
            }
        }
        System.out.println(results);

        //enhanced for loop 寫法
        String[] words2 = {"RADAR", "WARTER START", "MILK KLIM", "RESERVERED", "IWI"};
        List<String> results2 = new ArrayList<>();

        for(String word2 : words2) {
            if(word2.equals(new StringBuilder(word2).reverse().toString())) {
                results2.add(word2);
            }
        }
        System.out.println(results2);

        //Lambda可以一行解決,但我不會,實在太魔幻了哈哈哈
        String[] words3 = {"RADAR", "WARTER START", "MILK KLIM", "RESERVERED", "IWI"};
        List<String> results3 = Arrays.stream(words3).filter(word3 -> word3.equals(new StringBuilder(word3).reverse().toString())).collect(Collectors.toList());
        System.out.println(results3);
    }

    static void foreach(List list) {
        int size = list.size();
        for(int i = 0; i < size; i++) {
            System.out.println(list.get(i));
        }
    }

    static void enhancedForLoop(List list) {
        for(Object o : list) {
            System.out.println(o);
        }
    }
}
