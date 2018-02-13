package idv.workshop.homework;

import java.util.LinkedList;
import java.util.Queue;

interface Request2 {
    void execute();
}

public class RequestQueue2 {
    public static void main(String[] args) {
        Queue<Request2> requests = new LinkedList<>();
        offerRequestTo(requests);
        process(requests);
    }

    static void offerRequestTo(Queue<Request2> requests) {
        //模擬將請求加入佇列
        for (int i = 1; i < 6; i++){
            requests.offer(
                    () -> System.out.printf("資料處理 %f%n", Math.random())
            );
        }
    }

    //處理佇佇列中的請求
    static void process(Queue<Request2> requests) {
        while (requests.peek() != null) {
            Request2 request = requests.poll();
            request.execute();
        }
    }
}
