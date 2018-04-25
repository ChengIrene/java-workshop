package idv.workshop.homework;

class Resource1 {
    private String name;
    private int resource;

    Resource1(String name, int resource) {
        this.name = name;
        this.resource = resource;
    }

    String getName() {
        return name;
    }

    synchronized int doSome() {
        return ++resource;
    }

    synchronized void cooperate(Resource1 resource) {
        resource.doSome();
        System.out.printf("%s 整合 %s 的資源%n", this.name, resource.getName());
     }
}

public class DeadLockDemo {

    public static void main(String[] args) {
        Resource1 resource1 = new Resource1("resource1", 10);
        Resource1 resource2 = new Resource1("resource2", 20);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource1.cooperate(resource2);  // 取得resource1的鎖定
                // 然後thread1打算運用傳入的resource2呼叫doSome(),應取得resource2的鎖定,但現在卻被thread2拿走了
                // 於是thread1進入阻斷然後就卡住惹!!! 跑不動RRR
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource2.cooperate(resource1);  // 取得resource2的鎖定
                // 然後thread1打算運用傳入的resource1呼叫doSome(),應取得resource2的鎖定,但現在卻被thread1拿走了
                // 於是thread2進入阻斷
            }
        });

        // 簡單來說就是一個 "你不放開resource1鎖定,我就不放開resource2鎖定" 的狀態
        //

        thread1.start();
        thread2.start();
    }
}
