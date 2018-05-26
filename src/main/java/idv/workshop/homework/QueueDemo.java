package idv.workshop.homework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        //利用offer() 新增Queue元素
        q.offer("First");
        q.offer("Second");
        q.offer("Third");

        String o;

        System.out.println(q.toString());  //執行結果 [First, Second, Third]

        //透過poll()邊取得元素內容邊移除該元素  //執行結果 First Second Third
        while ((o = q.poll()) != null) {  // poll() 的特性是取得元素內容後就把該元素刪除,所以最後只剩框框
            String s = o;
            System.out.println(s);
        }

        System.out.println(q.toString());  //執行結果 [ ]
    }
}
