package idv.workshop.homework;

import java.util.Map;
import java.util.TreeMap;

public class MapKeyValue3 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("one", "ONE");
        map.put("two", "TWO");
        map.put("three", "THREE");

        map.forEach((key, value) -> System.out.printf("(Key %s, Value %s)%n", key, value));
        //Map沒有繼承Iterable,上面的forEach方法是定義在Map介面上,其接受java.util.function.BiConsumer<T, U>介面實例
        //這個介面只有一個抽象方法void accept(T t, U u)必須實作,兩個參數分別接受每次迭代Map而得的鍵與值
        //結合Lambda表示式可以獲得不錯的可讀性,但對現在的我還太跳痛就是 囧rz!!!
    }
}
