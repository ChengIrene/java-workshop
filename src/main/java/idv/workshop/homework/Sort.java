package idv.workshop.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List accounts = Arrays.asList(
                new Account("Kondou", "kyokucyou", 2000),
                new Account("Hijikata", "fukucyou", 1000),
                new Account("Okita", "taicyou", 500)
        );
        Collections.sort(accounts);  //根據實作Comparable介面中的compareTo()方法傳回的數由小排到大
        System.out.println(accounts);
    }
}
