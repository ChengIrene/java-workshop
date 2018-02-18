package idv.workshop.homework;

import java.util.Map;
import java.util.TreeMap;

public class Messages2 {
    public static void main(String[] args) {
        //如果使用TreeMap建立鍵值對應,則鍵的部分將會排序
        //條件是作為鍵的物件必須實作Comparable介面,或者是在建構TreeMap時指定實作Comparator介面的物件
        //由於String有實作Comparable介面,所以結果會是根據鍵來排序
        Map<String, String> messages = new TreeMap<>();

        messages.put("Seisirou", "Hello！Seisirouからのメッセージ！");
        messages.put("Subaru", "Subaruへのメッセージ！");
        messages.put("Hokuto", "Hokuto猫にゃーにゃー！");

        System.out.println(messages);
    }
}
