package idv.workshop.homework;

public class DaemonDemo {  //守護執行緒

    public static void main(String[] args) {  //main()為非Daemon執行緒

        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("OTZ");  //可能我的電腦跑太慢!? 跑的時候有時還是會出現幾個OTZ
            }
        });

        //可以用isDaemon()方法則可以判斷該執行緒是否為Daemon執行緒
        System.out.println(thread.isDaemon());  //這邊是false

        System.out.println("123");  //非Daemon

        thread.setDaemon(true);  //設定一個執行緒是否為Daemon執行緒
        thread.start();


        System.out.println("321");  //非Daemon
        System.out.println(thread.isDaemon());  //這邊是true
    }
}
