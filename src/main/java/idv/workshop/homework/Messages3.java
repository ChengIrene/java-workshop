package idv.workshop.homework;

import java.util.Map;
import java.util.TreeMap;

public class Messages3 {
    public static void main(String[] args) {
        Map<String, String> messages = new TreeMap<>((s1, s2) -> -s1.compareTo(s2));
        //到現在還是覺得Lambda很跳痛XD 要多學一下了

        messages.put("Seisirou", "Hello！Seisirouからのメッセージ！");
        messages.put("Subaru", "Subaruへのメッセージ！");
        messages.put("Hokuto", "Hokuto猫にゃーにゃー！");

        System.out.println(messages);
    }
}
