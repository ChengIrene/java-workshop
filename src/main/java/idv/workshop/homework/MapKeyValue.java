package idv.workshop.homework;

import java.util.HashMap;
import java.util.Map;

public class MapKeyValue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("one", "ONE");
        map.put("two", "TWO");
        map.put("three", "THREE");

        System.out.println("顯示鍵");
        //ketSet()傳回Set
        map.keySet().forEach(key -> System.out.println(key));

        System.out.println("顯示值");
        //values()傳回Collection
        map.values().forEach(key -> System.out.println(key));

        foreach(map.keySet());
    }

    static void foreach(Iterable<String> iterable) {
        for(String element : iterable) {
            System.out.println(element);
        }
    }
}
