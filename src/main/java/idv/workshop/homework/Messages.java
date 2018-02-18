package idv.workshop.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>();  //以泛型語法指定鍵值型態
        //建立鍵值對應
        messages.put("Seisirou", "Hello！Seisirouからのメッセージ！");
        messages.put("Subaru", "Subaruへのメッセージ！");
        messages.put("Hokuto", "Hokuto猫にゃーにゃー！");

        Scanner console = new Scanner(System.in);
        System.out.println("誰のメッセージを取ります：");
        String message = messages.get(console.nextLine());  //指定鍵取回值
        System.out.println(message);
        System.out.println(messages);
    }
}
